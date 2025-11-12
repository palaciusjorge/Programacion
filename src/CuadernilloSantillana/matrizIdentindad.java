package CuadernilloSantillana;

import java.util.Scanner;

public class matrizIdentindad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De que dimension quieres la matriz identidad: ");
        int dimension = sc.nextInt();
        int[][] identidad = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == j) {
                    identidad[i][j] = 1;
                } else {
                    identidad[i][j] = 0;
                }
            }
        }
        System.out.println("La matriz identidad de la dimension introducida es: ");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(identidad[i][j] + " ");
            }
            System.out.println();
        }
    }
}
