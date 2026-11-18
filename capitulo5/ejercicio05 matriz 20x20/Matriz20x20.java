/** Ejercicio 5.5 - Matriz 20x20: filas pares con unos y filas impares con ceros. */
public class Matriz20x20 {
    public static void main(String[] args) {
        int[][] m = new int[20][20];

        for (int i = 1; i <= 20; i++) {              // Fila numerada desde 1, como en el diagrama
            for (int j = 1; j <= 20; j++) {
                if (i % 2 == 0) {
                    m[i - 1][j - 1] = 1;             // Fila par -> unos
                } else {
                    m[i - 1][j - 1] = 0;             // Fila impar -> ceros
                }
            }
        }

        for (int i = 0; i < 20; i++) {               // Impresión
            for (int j = 0; j < 20; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
