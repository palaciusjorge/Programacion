package Sesion6;

import java.util.Scanner;

public class EJERCICIO7 {
    public static void main(String[] args) {
        /*EJERCICIO 7 : Haz un programa que intente dividir dos números.
        Usa try-catch-finally para mostrar siempre un mensaje final que diga "Operación terminada".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el dividendo :");
        int dividendo = scanner.nextInt();
        System.out.println("Introduzca el divisor :");
        int divisor = scanner.nextInt();
        try{
            int resultado = dividendo/divisor;
            System.out.println( "El resultado de la division es : " + resultado);
        } catch(ArithmeticException ex){
            System.err.println("Error: No esta permitido dividir por 0");
        } finally{
            System.out.println("Operación terminada.");
        }
    }
}
