package Sesion9;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
         Invertir un array
        Crea un programa que invierta los elementos de un array. Por ejemplo, si el array es {1,
        2, 3, 4, 5}, el resultado debe ser {5, 4, 3, 2, 1}.
        */
        int[] arrayEnteros = {10, 20, 30, 40, 50};
        ArrayList<Integer> lista = new ArrayList<>();
        for (int num : arrayEnteros) {
            lista.add(num);
        }
        System.out.println("Contenido: " + lista);
    }
}
