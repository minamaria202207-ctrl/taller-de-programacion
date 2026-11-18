import java.util.Scanner;

/** Ejercicio 5.4 - Convertir un número decimal a una base entre 2 y 16. */
public class DecimalABase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número decimal (N >= 0): ");
        int n = sc.nextInt();
        System.out.print("Base de destino (2 a 16): ");
        int b = sc.nextInt();

        if (n < 0 || b < 2 || b > 16) {              // Validación
            System.out.println("Error: datos inválidos.");
            return;
        }
        if (n == 0) {                                // Caso especial
            System.out.println("0");
            return;
        }

        String digitos = "0123456789ABCDEF";         // Símbolo de cada valor 0..15
        StringBuilder d = new StringBuilder();
        int original = n;
        while (n > 0) {
            int r = n % b;                           // Residuo = siguiente dígito (de derecha a izquierda)
            d.insert(0, digitos.charAt(r));          // Se antepone, así queda en el orden correcto
            n = n / b;
        }

        System.out.println(original + " en base " + b + " = " + d);
    }
}
