package matrices_y_mapas;

import java.util.TreeMap;

public class ColoresMapa {
    public static void main(String[] args) {
        TreeMap<Integer, String> colores = new TreeMap<>();
        colores.put(1, "Rojo");
        colores.put(2, "Azul");
        colores.put(3, "Verde");
        colores.put(4, "Amarillo");

        // Eliminar un color
        colores.remove(2); // elimina "Azul"

        // Imprimir mapa resultante
        System.out.println("Mapa actualizado: " + colores);
    }
}