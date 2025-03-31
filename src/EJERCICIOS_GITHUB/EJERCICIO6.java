package EJERCICIOS_GITHUB;

import java.util.Random;
import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        // EJERCICIO 6 : Adivina el numero con pistas

        Scanner scanner7 = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100) + 1;
        int intento;
        do{
            System.out.println("Prueba suerte con un numero del 1 al 100 : ");
            intento = scanner7.nextInt();
            if(intento<numeroSecreto){
                System.out.println("El numero es mayor que el introducido");
            }else{
                System.out.println("El numero es menor que el introducido");
            }
        }while(intento != numeroSecreto);
        System.out.println("Enhorabuena has encontrado el numero secreto.");
    }
}
