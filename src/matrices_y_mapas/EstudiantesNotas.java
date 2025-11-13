package matrices_y_mapas;

import java.util.HashMap;
import java.util.Map;

public class EstudiantesNotas {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();

        notas.put("Juan", 8);
        notas.put("María", 9);
        notas.put("Carlos", 7);
        notas.put("Lucía", 10);
        notas.put("Pedro", 6);

        // Mostrar nombres y notas
        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}