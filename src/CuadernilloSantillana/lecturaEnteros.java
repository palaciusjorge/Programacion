package CuadernilloSantillana;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lecturaEnteros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        try{
            int num = (int) sc.nextDouble();
            System.out.println("Gracias por introducir el numero " + num +" !");
        } catch (InputMismatchException e) {
            System.err.println("Por favor introduce un numero.");

        }
    }
}
