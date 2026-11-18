import java.util.Scanner;

/** Ejercicio 3.6 - Suma de los elementos de cada fila de una matriz N x M. */
public class SumaFilas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de filas (N) y de columnas (M): ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];

        System.out.println("Digite los elementos fila por fila:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int s = 0;                               // Se reinicia en cada fila
            for (int j = 0; j < m; j++) {
                s = s + a[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + s);
        }
    }
}
