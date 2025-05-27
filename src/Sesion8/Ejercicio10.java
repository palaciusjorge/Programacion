package Sesion8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Ejercicio10 {
    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(4);
        listaEnteros.add(4);
        listaEnteros.add(5);
        listaEnteros.add(1);
        listaEnteros.add(6);
        ArrayList<Integer> listaSinDuplicados = listaEnteros.stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Lista sin duplicados: " + listaSinDuplicados);
    }

}

