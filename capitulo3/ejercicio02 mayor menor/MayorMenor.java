import java.util.Scanner;

/** Ejercicio 3.2 - Valor mayor y menor de una tabla de N elementos. */
public class MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de elementos N: ");
        int n = sc.nextInt();
        if (n < 1) {                                 // Validación
            System.out.println("Error: N debe ser mayor o igual a 1.");
            return;
        }

        int[] t = new int[n];
        for (int i = 0; i < n; i++) {                // Carga de la tabla
            System.out.print("Elemento " + (i + 1) + ": ");
            t[i] = sc.nextInt();
        }

        int mayor = t[0];                            // Se parte del primer elemento
        int menor = t[0];
        for (int i = 1; i < n; i++) {
            if (t[i] > mayor) {
                mayor = t[i];
            } else if (t[i] < menor) {
                menor = t[i];
            }
        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
