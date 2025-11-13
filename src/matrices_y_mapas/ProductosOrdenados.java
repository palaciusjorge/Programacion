package matrices_y_mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductosOrdenados {
    public static void main(String[] args) {
        HashMap<String, Double> precios = new HashMap<>();
        precios.put("Pan", 0.90);
        precios.put("Leche", 1.20);
        precios.put("Manzana", 1.50);
        precios.put("Huevos", 2.50);

        // Ordenar por nombre usando TreeMap
        TreeMap<String, Double> preciosOrdenados = new TreeMap<>(precios);

        // Imprimir mapa ordenado
        for (Map.Entry<String, Double> entry : preciosOrdenados.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}