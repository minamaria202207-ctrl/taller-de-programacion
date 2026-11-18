import java.util.Scanner;

/** Ejercicio 2.3 - Clasificar N números como positivos, negativos o cero. */
public class PositivosNegativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números va a evaluar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {              // Ciclo de N repeticiones
            System.out.print("Número " + i + ": ");
            double v = sc.nextDouble();             // Se acepta también decimales

            if (v > 0) {
                System.out.println("  -> positivo");
            } else if (v < 0) {
                System.out.println("  -> negativo");
            } else {
                System.out.println("  -> es cero");
            }
        }
    }
}
