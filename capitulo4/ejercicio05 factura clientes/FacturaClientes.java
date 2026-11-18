import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/** Ejercicio 4.5 - Factura por cliente desde un fichero de pedidos (corte de control). */
public class FacturaClientes {
    public static void main(String[] args) throws IOException {
        // 1) Cargar los artículos en memoria: codigo -> {descripcion, precio}
        Map<String, String[]> art = new HashMap<>();
        for (String linea : Files.readAllLines(Paths.get("articulos.txt"))) {
            String[] c = linea.split(";");
            art.put(c[0], new String[]{c[1], c[2]});
        }

        // 2) Recorrer los pedidos, ordenados por cliente
        try (BufferedReader br = Files.newBufferedReader(Paths.get("pedidos.txt"))) {
            String linea = br.readLine();
            while (linea != null) {
                String cli = linea.split(";")[0];          // Cliente que se está facturando
                double total = 0;
                System.out.println("===== FACTURA - Cliente " + cli + " =====");

                while (linea != null && linea.split(";")[0].equals(cli)) {
                    String[] p = linea.split(";");
                    int cant = Integer.parseInt(p[2].trim());
                    String[] a = art.get(p[1]);
                    if (a == null) {
                        System.out.println("  Artículo " + p[1] + " no existe en articulos.txt");
                    } else {
                        double sub = cant * Double.parseDouble(a[1]);
                        System.out.printf(Locale.US, "  %-10s x%-3d %,12.2f%n", a[0], cant, sub);
                        total = total + sub;
                    }
                    linea = br.readLine();
                }
                System.out.printf(Locale.US, "  TOTAL: %,.2f%n%n", total);
            }
        }
    }
}
