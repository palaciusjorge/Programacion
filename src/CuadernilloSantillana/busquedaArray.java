package CuadernilloSantillana;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class busquedaArray {
    public static void main(String[] args) {
        int[] lista = new int[10];
        Random rand = new Random(); // Objeto para generar números aleatorios

        for (int i = 0; i < lista.length; i++) {
            lista[i] = rand.nextInt(50) + 1; // nextInt(50) genera 0-49, sumamos 1 para 1-50
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 50 para saber si está en la lista: ");
        int intento = sc.nextInt();
        boolean encontrado = false;
        for(int i = 0; i < lista.length;i++){
            if (intento == lista[i]){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("El numero " + intento + " si estaba en la lista!");
        }else{
            System.out.println("Vaya, parece que no hubo suerte...");
        }
        System.out.println("La lista generada ha sido: " + Arrays.toString(lista));
    }
}
