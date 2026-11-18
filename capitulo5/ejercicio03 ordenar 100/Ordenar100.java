import java.util.Random;

/** Ejercicio 5.3 - Ordenar una tabla de 100 elementos por el método de selección. */
public class Ordenar100 {

    // Imprime la tabla, 10 valores por línea
    static void imprimir(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.printf("%4d", t[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] t = new int[100];
        Random rnd = new Random();
        for (int i = 0; i < t.length; i++) {
            t[i] = rnd.nextInt(999) + 1;             // Valores entre 1 y 999
        }

        System.out.println("Tabla original:");
        imprimir(t);

        for (int i = 0; i < t.length - 1; i++) {
            int min = i;                             // Posición del menor encontrado
            for (int j = i + 1; j < t.length; j++) {
                if (t[j] < t[min]) {
                    min = j;
                }
            }
            int aux = t[i];                          // Se coloca el menor en la posición i
            t[i] = t[min];
            t[min] = aux;
        }

        System.out.println("\nTabla ordenada:");
        imprimir(t);
    }
}
