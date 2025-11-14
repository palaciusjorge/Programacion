package Ejercicio1Clases;

public class Main {
    public static void main(String[] args) {

        // Crear un libro
        Libros libro1 = new Libros("El Quijote", "Miguel de Cervantes", 1605);

        // Mostrar información inicial
        libro1.mostrarInfo();

        System.out.println("\n--- Prestando el libro ---");
        libro1.prestar();  // marcar como prestado

        // Mostrar información después de prestarlo
        libro1.mostrarInfo();

        System.out.println("\n--- Devolviendo el libro ---");
        libro1.devolver(); // marcar como devuelto

        // Mostrar información final
        libro1.mostrarInfo();
    }
}
