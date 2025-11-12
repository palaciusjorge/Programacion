package CuadernilloSantillana;

import java.util.Scanner;

public class matrizTraspuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce de que dimension quieres tu matriz(ten en cuenta que sera cuadrada: ");
        int dimension = sc.nextInt();
        int[][] matriz = new int [dimension][dimension];
        int[][] traspuesta = new int[dimension][dimension];
        System.out.println("Introduce los valores de la matriz:");

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }
        System.out.println("\nMatriz traspuesta:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(traspuesta[i][j] + " ");
            }
            System.out.println();
        }

    }


}
