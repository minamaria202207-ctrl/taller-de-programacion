import java.util.Scanner;

/** Ejercicio 3.5 - Poner a ceros la diagonal principal de una matriz cuadrada. */
public class DiagonalCeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Orden de la matriz (N): ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];

        System.out.println("Digite los elementos fila por fila:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {                // Diagonal: fila == columna
            m[i][i] = 0;
        }

        System.out.println("Matriz resultante:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
