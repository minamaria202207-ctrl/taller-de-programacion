import java.util.Scanner;

/** Ejercicio 2.1 - Factorial de un número (N entre 0 y 20). */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero N (0 a 20): ");
        int n = sc.nextInt();                       // Entrada

        if (n < 0 || n > 20) {                      // Validación del rango
            System.out.println("Error: N debe estar entre 0 y 20.");
            return;
        }

        long f = 1;                                 // Acumulador del producto
        for (int i = 1; i <= n; i++) {              // F = 1 * 2 * 3 * ... * N
            f = f * i;
        }

        System.out.println("El factorial de " + n + " es: " + f);   // Salida
    }
}
