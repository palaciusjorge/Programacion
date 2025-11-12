package CuadernilloSantillana;

import java.util.Scanner;

public class double_to_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero decimal: ");
        double num = sc.nextDouble();
        int intNum = (int) num;
        System.out.println("Numero decimal introducido: " + num);
        System.out.println("Numero entero transformado: " + intNum);
        if(num == intNum){
            System.out.println("No hay perdida de información porque el decimal era exacto.");
        }else{
            System.out.println("Se ha perdido informacion del numero original.");
        }
    }
}

