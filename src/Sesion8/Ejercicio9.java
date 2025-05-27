package Sesion8;

import java.util.ArrayList;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] arrayEnteros = {10, 20, 30, 40, 50};
        ArrayList<Integer> lista = new ArrayList<>();
        for (int num : arrayEnteros) {
            lista.add(num);
        }
        System.out.println("Contenido: " + lista);
    }
}
