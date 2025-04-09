package Sesion7;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un número (en texto): ");
        String texto = scanner.nextLine();
        try {
            int numero = Integer.parseInt(texto);

            System.out.println("Número x 10: " + (numero * 10));

        }catch (NumberFormatException e){

            System.err.println("Era broma, ponme el numero normal que si no, no me entero jeje");

        }finally{

            System.out.println("He terminado mi trabajo, si eso me vuelves a ejecutar.");

        }

        scanner.close();
    }
}
