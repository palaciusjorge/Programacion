package matrices_y_mapas;

import java.util.HashMap;
import java.util.Map;

public class ProductosCantidades {
    public static void main(String[] args) {
        HashMap<String, Integer> productos = new HashMap<>();
        productos.put("Manzana", 10);
        productos.put("Pan", 5);
        productos.put("Leche", 8);

        // Actualizar cantidad de Pan
        productos.put("Pan", 12); // sobrescribe el valor anterior

        // Mostrar mapa actualizado
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
