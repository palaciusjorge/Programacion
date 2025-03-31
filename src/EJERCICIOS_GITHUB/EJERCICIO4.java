package EJERCICIOS_GITHUB;

import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {
        // EJERCICIO 4 : Imprimir numeros pares

        Scanner scanner5 = new Scanner(System.in);
        int rango;
        System.out.println("Introduzca un numero :");
        rango = scanner5.nextInt();
        for(int i = 1;i < rango; i+=2){
            System.out.println((i+1) + "");
        }
    }
}
