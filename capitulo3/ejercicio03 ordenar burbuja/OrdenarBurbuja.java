import java.util.Scanner;

/** Ejercicio 3.3 - Ordenar una tabla de menor a mayor (burbuja). */
public class OrdenarBurbuja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de elementos N: ");
        int n = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            t[i] = sc.nextInt();
        }

        // Burbuja: en cada pasada el mayor "sube" hasta su posición final
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < n - i; j++) {
                if (t[j] > t[j + 1]) {               // Desordenados -> intercambio
                    int aux = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = aux;
                }
            }
        }

        System.out.print("Tabla ordenada:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + t[i]);
        }
        System.out.println();
    }
}
