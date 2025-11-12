package CuadernilloSantillana;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Introduce un nombre a la lista (introduce 'fin' para terminar): ");
        while(true){
            nombre = sc.nextLine();
            if(nombre.equalsIgnoreCase("fin")){
                break;
            }
            listaNombres.add(nombre);
        }
        System.out.println("\nNombres introducidos:");
        for (String n : listaNombres) {
            System.out.println(n);
        }

    }
}
