package Sesion6;
import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        /*EJERCICIO 5
        Haz un programa que divida dos números enteros introducidos por el usuario. Usa try-catch para evitar que el programa se rompa si el divisor es 0.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el dividendo :");
        int dividendo = scanner.nextInt();
        System.out.println("Introduzca el divisor :");
        int divisor = scanner.nextInt();
        try{
            int resultado = dividendo/divisor;
            System.out.println("El resultado de la division es : " + resultado);
        } catch(ArithmeticException ex){
            System.err.println("Error: No esta permitido dividir por 0");
        }

    }
}
