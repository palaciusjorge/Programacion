package Sesion7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Introduce el dividendo :");

            int dividendo = scanner.nextInt();

            System.out.println("Introduce el divisor :");

            int divisor = scanner.nextInt();

            int division = dividendo / divisor;


            System.out.println("El resultado de la division es : " + division);
        }catch(ArithmeticException e){

            System.err.println("No puedes dividir por cero");

        }catch(InputMismatchException e){

            System.err.println("Introduce un numero por favor, no una cadena de texto.");

        }finally {

            System.out.println("Ha finalizado la ejecucion, puedes probar otra vez ejecutando el codigo de nuevo.");
        }

        scanner.close();
    }
}
