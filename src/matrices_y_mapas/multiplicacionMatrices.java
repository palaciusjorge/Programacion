package matrices_y_mapas;

import java.util.Random;

public class multiplicacionMatrices {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matriz1 = new int [2][2];
        int[][] matriz2 = new int [2][2];
        int[][] matriz3 = new int [2][2];

        for (int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[0].length; j++){
                matriz1[i][j] = rand.nextInt(5);
            }
        }
        for (int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[0].length; j++){
                matriz2[i][j] = rand.nextInt(5);
            }
        }
        for (int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                for(int k = 0; k < 2; k++){
                    matriz3[i][j] += matriz1[i][k]*matriz2[k][j];
                }
            }
        }
        System.out.println("Matriz generada 1: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz generada 2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Resultado multiplicacion: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }



    }
}
