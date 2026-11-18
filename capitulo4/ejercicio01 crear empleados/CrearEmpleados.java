import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/** Ejercicio 4.1 - Crear un fichero secuencial de empleados (codigo;nombre;salario). */
public class CrearEmpleados {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // try-with-resources: el fichero se cierra automáticamente al salir del bloque
        try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(Paths.get("empleados.txt")))) {
            System.out.print("Código del empleado (0 para terminar): ");
            int codigo = Integer.parseInt(sc.nextLine().trim());

            while (codigo != 0) {
                System.out.print("Nombre: ");
                String nombre = sc.nextLine().trim();
                System.out.print("Salario: ");
                double salario = Double.parseDouble(sc.nextLine().trim());

                out.println(codigo + ";" + nombre + ";" + salario);   // Un registro por línea

                System.out.print("Código del empleado (0 para terminar): ");
                codigo = Integer.parseInt(sc.nextLine().trim());
            }
        }
        System.out.println("Fichero empleados.txt creado.");
    }
}
