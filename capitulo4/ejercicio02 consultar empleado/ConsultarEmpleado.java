import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/** Ejercicio 4.2 - Consultar un empleado por código en un fichero secuencial. */
public class ConsultarEmpleado {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Código a consultar (0 para terminar): ");
        int codigo = Integer.parseInt(sc.nextLine().trim());

        while (codigo != 0) {
            boolean encontrado = false;                          // ENC

            try (BufferedReader br = Files.newBufferedReader(Paths.get("empleados.txt"))) {
                String linea;
                while (!encontrado && (linea = br.readLine()) != null) {   // Recorrido secuencial
                    String[] campos = linea.split(";");
                    if (Integer.parseInt(campos[0]) == codigo) {
                        encontrado = true;
                        System.out.println("  Nombre: " + campos[1] + " | Salario: " + campos[2]);
                    }
                }
            }
            if (!encontrado) {
                System.out.println("  El código " + codigo + " no existe.");
            }

            System.out.print("Código a consultar (0 para terminar): ");
            codigo = Integer.parseInt(sc.nextLine().trim());
        }
    }
}
