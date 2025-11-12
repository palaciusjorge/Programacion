package CuadernilloSantillana;

import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero del cual quieres saber la tabla de multiplicar: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(num +"*"+ i +" es "+ i*num);
        }
    }
}
