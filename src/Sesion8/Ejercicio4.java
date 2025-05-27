package Sesion8;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numeros = new int[10];
        boolean encontrado = false;
        int posicion = 0;

        System.out.println("Generando 10 números aleatorios entre 0 y 50...");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(51);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número entero del 0 al 50 y prueba suerte:");
        int numero = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                encontrado = true;
                posicion = i + 1;
                break;
            }
        }

        if (encontrado) {
            System.out.println("¡Enhorabuena! El número " + numero + " está en la lista en la posición " + posicion + ".");
        } else {
            System.out.println("Mala suerte, el número " + numero + " no está en la lista.");
        }

        scanner.close();
    }
}


