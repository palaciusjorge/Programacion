package Sesion6;
import java.util.Scanner;
public class EJERCICIO8 {
    public static void main(String[] args) {
        /*EJERCICIO * :
        Pide al usuario 5 números enteros. Suma solo los positivos usando continue para ignorar los negativos.
         */
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Introduzca un numero entero");
            int numero = scanner.nextInt();
            if(numero<0){
                continue;
            }else{
                suma += numero;
            }
        }
    System.out.println("La suma de los numeros positivos introducidos es : " + suma);
    }
}
