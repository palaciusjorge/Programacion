package matrices_y_mapas;

import java.util.ArrayList;

public class listaDeListasEstudiantes {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> estudiantes = new ArrayList<>();
        ArrayList<String> estudiante1 = new ArrayList<>();
        estudiante1.add("Juan");
        estudiante1.add("Pérez");
        estudiante1.add("20");
        estudiantes.add(estudiante1);

        ArrayList<String> estudiante2 = new ArrayList<>();
        estudiante2.add("María");
        estudiante2.add("Gómez");
        estudiante2.add("22");
        estudiantes.add(estudiante2);

        ArrayList<String> estudiante3 = new ArrayList<>();
        estudiante3.add("Carlos");
        estudiante3.add("López");
        estudiante3.add("19");
        estudiantes.add(estudiante3);

        System.out.println("Lista de estudiantes:\n");

        for (int i = 0; i < estudiantes.size(); i++) {
            ArrayList<String> est = estudiantes.get(i);
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.println("Nombre: " + est.get(0));
            System.out.println("Apellido: " + est.get(1));
            System.out.println("Edad: " + est.get(2));
            System.out.println();

        }
    }
}
