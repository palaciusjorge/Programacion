package CuadernilloSantillana;
import java.util.Arrays;
import java.util.Random;
public class sumaMatrices {
    public static void main(String[] args) {
        Random rand = new Random();
        int [][] matriz1 = new int[3][3];
        int [][] matriz2 = new int [3][3];
        int [][] matriz3 = new int [3][3];
        for (int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[0].length; j++){
                matriz1[i][j] = rand.nextInt(50);
            }
        }
        for (int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[0].length; j++){
                matriz2[i][j] = rand.nextInt(50);
            }
        }
        for (int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[0].length; j++){
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[0].length; j++){
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
