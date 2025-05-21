package Sesion8;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Introduce 5 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int maximo = numeros[0];
        int minimo = numeros [0];
        for(int num : numeros){
            if (num > maximo){
                maximo = num;
            } else if (num < minimo) {
                minimo = num;
            }else {
                continue;
            }


        }
        System.out.println("El maximo de los numeros introducidos es : " + maximo + " y el minimo es : " + minimo);
    }
}
