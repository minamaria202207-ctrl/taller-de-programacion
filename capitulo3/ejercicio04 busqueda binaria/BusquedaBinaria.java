import java.util.Scanner;

/** Ejercicio 3.4 - Búsqueda binaria en una lista ordenada ascendentemente. */
public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de elementos N: ");
        int n = sc.nextInt();
        int[] t = new int[n + 1];                    // Posiciones 1..N (la 0 no se usa)
        System.out.println("Digite los elementos ya ordenados de menor a mayor:");
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt();
        }
        System.out.print("Valor a buscar (A): ");
        int a = sc.nextInt();

        int inf = 1, sup = n, pos = 0;
        boolean hallado = false;
        while (inf <= sup && !hallado) {
            int med = (inf + sup) / 2;               // Elemento central del intervalo
            if (t[med] == a) {
                hallado = true;
                pos = med;
            } else if (t[med] < a) {
                inf = med + 1;                       // Se descarta la mitad izquierda
            } else {
                sup = med - 1;                       // Se descarta la mitad derecha
            }
        }

        if (hallado) {
            System.out.println("El valor " + a + " está en la posición " + pos);
        } else {
            System.out.println("El valor " + a + " no existe en la lista");
        }
    }
}
