package Sesion8;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Introduce 5 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("La suma de los numeros introducidos es : " + suma);
    }
}
