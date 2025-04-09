package Sesion7;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adivina el número (1-10): ");
        String intentoTexto = scanner.nextLine();
        try{
            int intento = Integer.parseInt(intentoTexto);

            if (intento == numeroSecreto) {

                System.out.println("¡Correcto!");

            } else {

                System.out.println("Incorrecto. El número era: " + numeroSecreto);
            }

        }catch(NumberFormatException e){
            System.out.println("No has introducido un numero, has perdido el juego.");
        }finally {
            System.out.println("El juego ha finalizado.");
        }

    scanner.close();


    }
}
