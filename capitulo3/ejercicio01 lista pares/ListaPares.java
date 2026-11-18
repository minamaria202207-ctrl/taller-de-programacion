/** Ejercicio 3.1 - Tabla de 200 elementos con los números pares. */
public class ListaPares {
    public static void main(String[] args) {
        int[] t = new int[200];                      // Tabla en memoria

        for (int i = 0; i < 200; i++) {              // Llenado: posición i guarda el par (i+1)*2
            t[i] = 2 * (i + 1);
        }

        for (int i = 0; i < 200; i++) {              // Impresión, 10 valores por línea
            System.out.print(t[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
