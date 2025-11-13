package matrices_y_mapas;

import java.util.ArrayList;

public class listaDeListaDeListas {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> lista = new ArrayList<>();
        // Estudiante 1
        ArrayList<String> estudiante1 = new ArrayList<>();
        estudiante1.add("Juan");
        estudiante1.add("Pérez");
        estudiante1.add("López");
        lista.add(estudiante1);

        // Estudiante 2
        ArrayList<String> estudiante2 = new ArrayList<>();
        estudiante2.add("María");
        estudiante2.add("Gómez");
        estudiante2.add("Fernández");
        lista.add(estudiante2);

        // Estudiante 3
        ArrayList<String> estudiante3 = new ArrayList<>();
        estudiante3.add("Carlos");
        estudiante3.add("Sánchez");
        estudiante3.add("Ruiz");
        lista.add(estudiante3);

        // Imprimir toda la lista de listas
        System.out.println("Lista de estudiantes:");
        System.out.println(lista);

    }
}
