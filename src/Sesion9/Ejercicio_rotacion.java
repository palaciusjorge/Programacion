package Sesion9;

import java.util.Arrays;

public class Ejercicio_rotacion {
    public static void main(String[] args) {
        //Escribe un programa que rote los elementos de un array una posición hacia la derecha.
        //Ejemplo: {1, 2, 3, 4, 5} → {5, 1, 2, 3, 4}.
        int[] array = {1, 2, 3, 4, 5};
        int ultima_posicion = array[array.length - 1];
        for(int i = array.length -1 ; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = ultima_posicion;
        System.out.println(Arrays.toString(array));
    }
}
