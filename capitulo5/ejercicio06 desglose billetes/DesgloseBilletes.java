import java.util.Scanner;

/** Ejercicio 5.6 - Desglose de una cantidad en billetes y monedas. */
public class DesgloseBilletes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Denominaciones de mayor a menor (se pueden cambiar sin alterar el algoritmo)
        int[] den = {5000, 1000, 500, 100, 50, 25, 10, 5, 1};

        System.out.print("Cantidad a desglosar: ");
        int cantidad = sc.nextInt();
        if (cantidad < 1) {                          // Validación
            System.out.println("Error: la cantidad debe ser mayor o igual a 1.");
            return;
        }

        for (int i = 0; i < den.length; i++) {
            int n = cantidad / den[i];               // Cuántas piezas de esta denominación
            cantidad = cantidad % den[i];            // Lo que queda por pagar
            if (n > 0) {
                System.out.println(n + " x " + den[i]);
            }
        }
    }
}
