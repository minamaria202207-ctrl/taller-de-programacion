import java.util.Locale;
import java.util.Scanner;

/** Ejercicio 2.4 - Cantidad descontada y cantidad a pagar con un tanto por ciento. */
public class Descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);   // decimales con punto

        System.out.print("Ingrese el número (precio): ");
        double n = sc.nextDouble();
        System.out.print("Ingrese el tanto por ciento de descuento (0-100): ");
        double t = sc.nextDouble();

        if (t < 0 || t > 100) {                     // Validación
            System.out.println("Error: el tanto por ciento debe estar entre 0 y 100.");
            return;
        }

        double c = n * t / 100;                     // Cantidad descontada
        double p = n - c;                           // Cantidad a pagar

        System.out.printf(Locale.US, "Número: %.2f%n", n);
        System.out.printf(Locale.US, "Tanto por ciento: %.2f%%%n", t);
        System.out.printf(Locale.US, "Cantidad descontada: %.2f%n", c);
        System.out.printf(Locale.US, "Cantidad a pagar: %.2f%n", p);
    }
}
