package matrices_y_mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        HashMap<String, String> capitales = new HashMap<>();
        capitales.put("España", "Madrid");
        capitales.put("México", "Ciudad de México");
        capitales.put("Argentina", "Buenos Aires");
        capitales.put("Francia", "París");
        capitales.put("Italia", "Roma");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de un país: ");
        String pais = sc.nextLine().trim();

        if (capitales.containsKey(pais)) {
            System.out.println("La capital de " + pais + " es " + capitales.get(pais));
        } else {
            System.out.println(pais + " no está en la lista.");
        }

        sc.close();
    }
}