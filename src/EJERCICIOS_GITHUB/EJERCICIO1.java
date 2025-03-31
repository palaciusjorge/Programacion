package EJERCICIOS_GITHUB;

import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) {
        //EJERCICIO 1: CLASIFICACIÓN DE EDAD
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su edad :");
        int edad = scanner.nextInt();
        if(edad < 18){
            System.out.println("Eres menor de edad.");
        } else if (18 <= edad && edad < 64){
            System.out.println("Eres una persona adulta.");
        }
        else{
            System.out.println("Eres una persona en edad de jubilacion.");
        }
    }
}
