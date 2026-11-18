import java.util.Scanner;

/** Ejercicio 5.2 - Divisores de K números y cantidad de divisores de cada uno. */
public class Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números va a analizar? (K): ");
        int k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            System.out.print("Número " + i + ": ");
            int n = sc.nextInt();

            int c = 0;                               // Contador de divisores
            System.out.print("  Divisores de " + n + ":");
            for (int d = 1; d <= n; d++) {
                if (n % d == 0) {                    // División exacta -> d es divisor
                    System.out.print(" " + d);
                    c = c + 1;
                }
            }
            System.out.println();
            System.out.println("  Cantidad de divisores: " + c);
        }
    }
}
