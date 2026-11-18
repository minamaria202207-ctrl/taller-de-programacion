import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

/** Ejercicio 4.4 - Actualizar el maestro de existencias con un fichero de movimientos. */
public class ActualizarMaestro {

    // Devuelve el campo número 'i' de una línea con campos separados por ';'
    static int campo(String linea, int i) {
        return Integer.parseInt(linea.split(";")[i].trim());
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader maestro = Files.newBufferedReader(Paths.get("maestro.txt"));
             BufferedReader movs = Files.newBufferedReader(Paths.get("movimientos.txt"));
             PrintWriter nuevo = new PrintWriter(Files.newBufferedWriter(Paths.get("maestro_nuevo.txt")))) {

            String lm = maestro.readLine();               // Primer registro de cada fichero
            String lv = movs.readLine();

            while (lm != null) {
                int art = campo(lm, 0);
                int exist = campo(lm, 1);

                // Movimientos de artículos menores al actual: no existen en el maestro
                while (lv != null && campo(lv, 0) < art) {
                    System.out.println("Aviso: el artículo " + campo(lv, 0) + " no existe en el maestro.");
                    lv = movs.readLine();
                }
                // Movimientos del artículo actual: se acumulan
                while (lv != null && campo(lv, 0) == art) {
                    exist = exist + campo(lv, 1);
                    lv = movs.readLine();
                }

                nuevo.println(art + ";" + exist);          // Registro actualizado
                lm = maestro.readLine();
            }

            // Si sobran movimientos, son de artículos mayores al último del maestro
            while (lv != null) {
                System.out.println("Aviso: el artículo " + campo(lv, 0) + " no existe en el maestro.");
                lv = movs.readLine();
            }
        }

        System.out.println("Nuevo maestro (maestro_nuevo.txt):");
        for (String linea : Files.readAllLines(Paths.get("maestro_nuevo.txt"))) {
            System.out.println("  " + linea);
        }
    }
}
