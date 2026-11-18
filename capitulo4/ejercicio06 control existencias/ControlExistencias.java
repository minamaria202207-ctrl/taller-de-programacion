import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Ejercicio 4.6 - Control de existencias con menú (insertar, modificar, eliminar, listar). */
public class ControlExistencias {

    // Devuelve la posición del código en la lista, o -1 si no existe
    static int buscar(List<String[]> lista, String codigo) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i)[0].equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Path ruta = Paths.get("existencias.txt");

        // Carga del fichero en memoria (registro = {codigo, nombre, cantidad})
        List<String[]> lista = new ArrayList<>();
        if (Files.exists(ruta)) {
            for (String linea : Files.readAllLines(ruta)) {
                lista.add(linea.split(";"));
            }
        }

        int opc;
        do {
            System.out.print("\nMenú: 1=Insertar 2=Modificar 3=Eliminar 4=Listar 0=Salir -> ");
            opc = Integer.parseInt(sc.nextLine().trim());

            if (opc == 1) {
                System.out.print("Código: ");
                String cod = sc.nextLine().trim();
                System.out.print("Nombre: ");
                String nom = sc.nextLine().trim();
                System.out.print("Cantidad: ");
                String cant = sc.nextLine().trim();
                if (buscar(lista, cod) >= 0) {             // No se permiten códigos repetidos
                    System.out.println("  Ese código ya existe.");
                } else {
                    lista.add(new String[]{cod, nom, cant});
                    System.out.println("  Registro insertado.");
                }
            } else if (opc == 2) {
                System.out.print("Código a modificar: ");
                int pos = buscar(lista, sc.nextLine().trim());
                System.out.print("Nueva cantidad: ");
                String cant = sc.nextLine().trim();
                if (pos < 0) {
                    System.out.println("  El código no existe.");
                } else {
                    lista.get(pos)[2] = cant;
                    System.out.println("  Cantidad modificada.");
                }
            } else if (opc == 3) {
                System.out.print("Código a eliminar: ");
                int pos = buscar(lista, sc.nextLine().trim());
                if (pos < 0) {
                    System.out.println("  El código no existe.");
                } else {
                    lista.remove(pos);
                    System.out.println("  Registro eliminado.");
                }
            } else if (opc == 4) {
                System.out.println("  CODIGO  NOMBRE      CANTIDAD");
                for (String[] r : lista) {
                    System.out.printf("  %-7s %-11s %s%n", r[0], r[1], r[2]);
                }
            } else if (opc != 0) {
                System.out.println("  Opción inválida.");
            }
        } while (opc != 0);

        // Al salir se graba la lista completa
        try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(ruta))) {
            for (String[] r : lista) {
                out.println(r[0] + ";" + r[1] + ";" + r[2]);
            }
        }
        System.out.println("Cambios guardados en existencias.txt");
    }
}
