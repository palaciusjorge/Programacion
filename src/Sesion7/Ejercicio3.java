package Sesion7;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        String[] frutas = {"Manzana", "Banana", "Naranja"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero entre 0 y 2 : ");

        int posicion = scanner.nextInt();

        try{

            System.out.println("La fruta que te toca comer hoy es : " + frutas[posicion]);

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Solo tienes 3 frutas en la nevera, pon 0, 1 o 2. Si quieres otra ve al super y la compras.");
        }
    }
}
