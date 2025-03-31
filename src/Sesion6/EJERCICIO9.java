package Sesion6;
import java.util.Scanner;
public class EJERCICIO9 {
    public static void main(String[] args) {
        /*Pide al usuario que introduzca un número.
        Si escribe una palabra u otro texto, el programa debe capturar la excepción y mostrar "Eso no es un número".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero :");
        try{
            double numero = scanner.nextDouble();
            System.out.println("El numero elegido es : " + numero);
        }catch(Exception e){
            System.out.println("Eso no es un numero, por favor introduzca un numero");
        }
    }
}
