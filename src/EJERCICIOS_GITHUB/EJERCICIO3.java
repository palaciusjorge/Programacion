package EJERCICIOS_GITHUB;

import java.util.Scanner;

public class EJERCICIO3 {
    public static void main(String[] args) {
        //EJERCICIO 3: Simulacion de una calculadora
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduzca un numero para hacer una operación :");
        double numero1 = scanner2.nextDouble();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Introduzca el segundo numero :");
        double numero2 = scanner3.nextDouble();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Elige una opción: ");
        int opcion = scanner4.nextInt();
        switch(opcion){
            case 1:
                System.out.println("El resultado es : " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("El resultado es : " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("El resultado es : " + (numero1*numero2));
                break;
            case 4:
                if(numero2 != 0){
                    System.out.println("El resultado es : " + (numero1/numero2));
                } else{
                    System.out.println("No puedes dividir por cero.");
                }

                break;
            default:
                System.out.println("Opcion no valida.");

        }
    }
}
