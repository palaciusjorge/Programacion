package matrices_y_mapas;

import java.util.ArrayList;

public class sumaListaDeListas {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listaNumeros = new ArrayList<>();
        // Lista 1
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(5);
        lista1.add(10);
        lista1.add(15);
        listaNumeros.add(lista1);

        // Lista 2
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(2);
        lista2.add(4);
        lista2.add(6);
        listaNumeros.add(lista2);

        // Lista 3
        ArrayList<Integer> lista3 = new ArrayList<>();
        lista3.add(7);
        lista3.add(14);
        lista3.add(21);
        listaNumeros.add(lista3);

        int suma = 0;

        for (ArrayList<Integer> lista : listaNumeros) {
            for (int num : lista) {
                suma += num;
            }
        }

        System.out.println("Suma de todos los números: " + suma);

    }
}
