package Sesion8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioExtra {
    public static void main(String[] args) {
        ArrayList<String> listaCompra = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- LISTA DE LA COMPRA ---");
            System.out.println("1. Añadir producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar lista ordenada");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el producto a añadir: ");
                    String producto = scanner.nextLine();
                    listaCompra.add(producto);
                    System.out.println("'" + producto + "' añadido a la lista.");
                    break;

                case 2:
                    if (listaCompra.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("\n--- TU LISTA DE LA COMPRA ---");
                        for (int i = 0; i < listaCompra.size(); i++) {
                            System.out.println((i + 1) + ". " + listaCompra.get(i));
                        }
                    }
                    break;

                case 3:
                    if (listaCompra.isEmpty()) {
                        System.out.println("La lista está vacía. No hay productos para eliminar.");
                    } else {
                        System.out.print("Introduce el nombre del producto a eliminar: ");
                        String productoEliminar = scanner.nextLine();

                        if (listaCompra.remove(productoEliminar)) {
                            System.out.println("'" + productoEliminar + "' eliminado de la lista.");
                        } else {
                            System.out.println("'" + productoEliminar + "' no encontrado en la lista.");
                        }
                    }
                    break;

                case 4:
                    if (listaCompra.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        ArrayList<String> listaOrdenada = new ArrayList<>(listaCompra);
                        Collections.sort(listaOrdenada);

                        System.out.println("\n--- LISTA ORDENADA ALFABÉTICAMENTE ---");
                        for (int i = 0; i < listaOrdenada.size(); i++) {
                            System.out.println((i + 1) + ". " + listaOrdenada.get(i));
                        }
                    }
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
