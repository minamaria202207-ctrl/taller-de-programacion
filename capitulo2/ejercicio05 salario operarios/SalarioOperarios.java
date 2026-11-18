import java.util.Locale;
import java.util.Scanner;

/** Ejercicio 2.5 - Salario semanal con horas extra (más de 40 h se pagan a 1,5 veces). */
public class SalarioOperarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Número de operarios: ");
        int n = sc.nextInt();
        System.out.print("Valor de la hora normal: ");
        double d = sc.nextDouble();

        double total = 0;                            // Acumulador de la nómina
        for (int i = 1; i <= n; i++) {
            System.out.print("Horas trabajadas por el operario " + i + ": ");
            double h = sc.nextDouble();

            double s;                                // Salario del operario
            if (h > 40) {
                s = 40 * d + (h - 40) * 1.5 * d;     // 40 h normales + extras con recargo
            } else {
                s = h * d;
            }
            System.out.printf(Locale.US, "  Salario operario %d: %.2f%n", i, s);
            total = total + s;
        }
        System.out.printf(Locale.US, "Total a pagar: %.2f%n", total);
    }
}
