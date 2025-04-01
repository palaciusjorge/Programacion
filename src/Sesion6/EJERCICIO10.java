package Sesion6;
import java.util.Scanner;
import java.util.Random;
public class EJERCICIO10 {
    public static void main(String[] args) {
        /* EJERCICIO 10 :
        Crea un número secreto entre 1 y 10. El usuario tiene que adivinarlo. Usa do-while y break para salir cuando acierte.
         */
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(10) + 1;
        int numeroIntento = 0;
        int intento;
        do{
            System.out.println("Prueba suerte con un numero del 1 al 10 : ");
            intento = scanner.nextInt();
            numeroIntento ++;
            if(numeroIntento == 5){
                System.out.println("Solo te quedan la mitad por probar!");
            }

        }while(intento != numeroSecreto);
        System.out.println("Has encontrado el numero secreto!");
    }
}
