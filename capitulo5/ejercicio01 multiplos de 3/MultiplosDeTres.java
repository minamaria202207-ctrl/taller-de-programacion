import java.util.Scanner;

/** Ejercicio 5.1 - Los N primeros múltiplos de 3. */
public class MultiplosDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos múltiplos de 3 desea? (N): ");
        int n = sc.nextInt();

        if (n < 1) {                                 // Validación
            System.out.println("Error: N debe ser mayor o igual a 1.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            int m = 3 * i;                           // Múltiplo número i
            System.out.print(m + " ");
        }
        System.out.println();
    }
}
