package CuadernilloSantillana;

import java.util.Scanner;

public class sumaArray {
    public static void main(String[] args) {
        int[] array = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 5 números enteros:");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        System.out.println("La suma de los numeros introducidos es : " + suma);
    }
}

