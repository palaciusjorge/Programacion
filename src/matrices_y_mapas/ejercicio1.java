package matrices_y_mapas;

import org.w3c.dom.ls.LSOutput;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ejercicio1 {
    public static void main(String[] args) {
        int [][] matriz1 = {{1,1,1}, {2,2,2},{3,3,3}};
        int [][] matriz2 = {{1,1,1}, {2,2,2},{3,3,3}};
        int[][] matriz3 =new int [3][3];
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j <= matriz1[0].length - 1; j++){
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matriz3));
    }
}

