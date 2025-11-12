package Sesion9;

import java.util.Scanner;

public class ejercicio_comparacion {
    public static void main(String[] args) {
        //Pide al usuario que introduzca dos arrays de enteros del mismo tamaño y muestra
        //cuántos elementos coinciden en la misma posición.
        //Ejemplo:
        //Array 1: {1, 2, 3, 4, 5}
        //Array 2: {1, 4, 3, 0, 5}
        //Coinciden en 3 posiciones (índices 0, 2 y 4).
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño de los arrays: ");
        int tamano = sc.nextInt();

        int[] array1 = new int[tamano];
        int[] array2 = new int[tamano];

        System.out.println("Introduce los elementos del primer array:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + i + ": ");
            array1[i] = sc.nextInt();
        }

        System.out.println("Introduce los elementos del segundo array:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Elemento " + i + ": ");
            array2[i] = sc.nextInt();
        }

        int coincidencias = 0;
        System.out.print("Coinciden en las posiciones: ");
        for (int i = 0; i < tamano; i++) {
            if (array1[i] == array2[i]) {
                System.out.print(i + " ");
                coincidencias++;
            }
        }

        System.out.println("\nTotal de coincidencias: " + coincidencias);

        sc.close();
    }
}

