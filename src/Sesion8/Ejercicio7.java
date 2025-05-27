package Sesion8;

import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        tareas.add("Hacer la compra");
        tareas.add("Estudiar para el examen");
        tareas.add("Llamar al médico");
        tareas.add("Pasear al perro");
        tareas.add("Limpiar la casa");
        System.out.println("Lista de tareas inicial:");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
        String tareaAEliminar = "Llamar al médico";
        boolean eliminado = tareas.remove(tareaAEliminar);
        if (eliminado) {
            System.out.println("\nSe eliminó: " + tareaAEliminar);
        } else {
            System.out.println("\nNo se encontró la tarea: " + tareaAEliminar);
        }
        System.out.println("\nLista de tareas actualizada:");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }
}
