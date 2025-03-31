package EJERCICIOS_GITHUB;

import java.util.Scanner;

public class EJERCICIO7 {
    public static void main(String[] args) {
        // EJERCICIO 7 : Serie de Fibonacci
        Scanner scanner8 = new Scanner(System.in);
        int numeroDeTerminos;
        System.out.println("Introduce el numero de terminos de la serie que quieres imprimir :");
        numeroDeTerminos = scanner8.nextInt();
        int termino1 = 0, termino2 = 1, termino3;
        for(int i = 0; i < numeroDeTerminos; i ++){
            System.out.println(termino1 + "");
            termino3 = termino1 + termino2;
            termino1 = termino2;
            termino2 = termino3;
        }
    }
}
