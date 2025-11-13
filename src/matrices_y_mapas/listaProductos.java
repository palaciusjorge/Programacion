package matrices_y_mapas;

import java.util.ArrayList;
import java.util.Scanner;

public class listaProductos {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> productos = new ArrayList<>();
        // Producto 1
        ArrayList<String> prod1 = new ArrayList<>();
        prod1.add("Manzana");
        prod1.add("1.50");
        productos.add(prod1);

        // Producto 2
        ArrayList<String> prod2 = new ArrayList<>();
        prod2.add("Pan");
        prod2.add("0.90");
        productos.add(prod2);

        // Producto 3
        ArrayList<String> prod3 = new ArrayList<>();
        prod3.add("Leche");
        prod3.add("1.20");
        productos.add(prod3);

        // Producto 4
        ArrayList<String> prod4 = new ArrayList<>();
        prod4.add("Huevos");
        prod4.add("2.50");
        productos.add(prod4);

        // Producto 5
        ArrayList<String> prod5 = new ArrayList<>();
        prod5.add("Arroz");
        prod5.add("1.10");
        productos.add(prod5);

        // Mostrar lista original
        System.out.println("Lista de productos:");
        System.out.println(productos);
        Scanner sc = new Scanner(System.in);
        System.out.println("De qué producto quieres cambiar el precio? ");
        String producoACambiar = sc.nextLine().trim();

        System.out.println("Que precio quieres que tenga este producto? ");
        String nuevoPrecio = sc.nextLine().trim();
        for (ArrayList<String> prod : productos) {
            if (prod.get(0).equalsIgnoreCase(producoACambiar)) {
                prod.set(1, nuevoPrecio); // reemplaza el precio
                break;
            }
        }

// Mostrar lista actualizada
        System.out.println("Lista de productos actualizada:");
        System.out.println(productos);

    }
}
