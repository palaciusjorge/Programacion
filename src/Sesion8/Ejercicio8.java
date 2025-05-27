package Sesion8;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Javier");
        listaNombres.add("Jorge");
        listaNombres.add("Jacinto");
        listaNombres.add("Laura");
        listaNombres.add("Irene");
        listaNombres.add("Blanca");
        listaNombres.add("Francisco");
        listaNombres.add("Candela");
        listaNombres.add("Almudena");
        String nombreConsulta;
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce que nombre quieres comprobar si esta en la lista");
        nombreConsulta = scn.nextLine();
        int posicion = listaNombres.indexOf(nombreConsulta);
        if (posicion != -1) {
            System.out.println("El nombre está en la lista en la posición: " + (posicion + 1));
        } else {
            System.out.println("El nombre no está en la lista.");
        }

    }
}
