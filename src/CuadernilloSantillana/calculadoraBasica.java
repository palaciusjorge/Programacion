package CuadernilloSantillana;

import java.util.Scanner;

public class calculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir los dos números
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        // Pedir la operación
        System.out.print("Introduce la operación (+, -, *, /): ");
        char operacion = sc.next().charAt(0);

        double resultado;

        // Realizar la operación usando switch
        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: División entre cero no permitida.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }

        sc.close();
    }
}

