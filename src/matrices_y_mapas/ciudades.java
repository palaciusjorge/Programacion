package matrices_y_mapas;

import java.util.ArrayList;

public class ciudades {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> listaCiudades = new ArrayList<>();
        ArrayList<String> listaPaises = new ArrayList<>();

        // Países
        listaPaises.add("España");
        listaPaises.add("México");
        listaPaises.add("Argentina");

        // Ciudades
        ArrayList<String> espana = new ArrayList<>();
        espana.add("Madrid");
        espana.add("Barcelona");
        espana.add("Valencia");
        listaCiudades.add(espana);

        ArrayList<String> mexico = new ArrayList<>();
        mexico.add("Ciudad de México");
        mexico.add("Guadalajara");
        mexico.add("Monterrey");
        listaCiudades.add(mexico);

        ArrayList<String> argentina = new ArrayList<>();
        argentina.add("Buenos Aires");
        argentina.add("Córdoba");
        argentina.add("Rosario");
        listaCiudades.add(argentina);

        String ciudadBuscada = "Córdoba";
        int indicePais = -1;

        for (int i = 0; i < listaCiudades.size(); i++) {
            if (listaCiudades.get(i).contains(ciudadBuscada)) {
                indicePais = i;
                break;
            }
        }

        if (indicePais != -1) {
            String pais = listaPaises.get(indicePais);
            System.out.println(ciudadBuscada + " está en " + pais);
            System.out.println("Ciudades de " + pais + ": " + listaCiudades.get(indicePais));
        } else {
            System.out.println(ciudadBuscada + " no se encontró.");
        }
    }
}

