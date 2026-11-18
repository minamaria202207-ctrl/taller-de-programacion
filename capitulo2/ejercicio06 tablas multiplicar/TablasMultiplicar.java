/** Ejercicio 2.6 - Las 10 primeras tablas de multiplicar. */
public class TablasMultiplicar {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {              // Ciclo externo: la tabla en curso
            System.out.println("--- Tabla del " + i + " ---");
            for (int j = 1; j <= 10; j++) {          // Ciclo interno: multiplicador
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
