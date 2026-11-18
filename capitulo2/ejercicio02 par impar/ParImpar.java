import java.util.Scanner;

/** Ejercicio 2.2 - Determinar si un número es par o impar. */
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();                       // Entrada

        int r = n % 2;                              // Residuo de dividir entre 2

        if (r == 0) {                               // Residuo 0 -> división exacta
            System.out.println(n + " es PAR");
        } else {
            System.out.println(n + " es IMPAR");
        }
    }
}
