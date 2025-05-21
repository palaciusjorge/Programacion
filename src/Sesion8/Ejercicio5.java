package Sesion8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Introduce 5 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nArray original:");
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);

        System.out.println("\nArray ordenado:");
        System.out.println(Arrays.toString(numeros));

        scanner.close();
    }
}