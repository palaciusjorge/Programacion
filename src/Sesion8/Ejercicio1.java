package Sesion8;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Introduce 5 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numeros));
    }
}