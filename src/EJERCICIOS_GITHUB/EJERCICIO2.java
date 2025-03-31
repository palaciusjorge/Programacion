package EJERCICIOS_GITHUB;

import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {
        //EJERCICIO 2:Contador de vocales
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduzca una palabra :");
        String palabra = scanner1.nextLine();
        String palabraProcesada = palabra.toLowerCase();
        int contadorVocales = 0;
        for (int posicion = 0; posicion < palabraProcesada.length(); posicion++){
            if("aeiou".indexOf(palabraProcesada.charAt(posicion)) != -1){
                contadorVocales ++;
            }

        }
        System.out.println("Esta palabra tiene " + contadorVocales + " vocales.");
    }
}
