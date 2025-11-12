package CuadernilloSantillana;

import java.util.Scanner;

public class parOimpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza el numero que quiere comprobar: ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("El numero introducido es par.");
        }else{
            System.out.println("El numero introducido es impar");
        }
    }
}
