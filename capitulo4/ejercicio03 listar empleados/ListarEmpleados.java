import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

/** Ejercicio 4.3 - Listar un fichero de empleados con total de salarios. */
public class ListarEmpleados {
    public static void main(String[] args) throws IOException {
        double total = 0;                                // T
        int cantidad = 0;                                // N

        System.out.println("CODIGO  NOMBRE             SALARIO");
        try (BufferedReader br = Files.newBufferedReader(Paths.get("empleados.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {    // Hasta el fin del fichero
                String[] c = linea.split(";");
                double salario = Double.parseDouble(c[2]);
                System.out.printf(Locale.US, "%-7s %-18s %,.2f%n", c[0], c[1], salario);
                total = total + salario;
                cantidad = cantidad + 1;
            }
        }
        System.out.println("Empleados: " + cantidad);
        System.out.printf(Locale.US, "Total de salarios: %,.2f%n", total);
    }
}
