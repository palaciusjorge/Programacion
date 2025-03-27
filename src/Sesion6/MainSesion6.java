package Sesion6;
import java.util.Scanner;
public class MainSesion6 {
    public static void main(String[]args){
        /*EJERCICIO1
         Haz un programa que pida al usuario números enteros positivos.
         El programa debe terminar cuando el usuario introduzca el número 0.
         Usa un bucle while con break.
         */
        Scanner scn1 = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        int numero = scn1.nextInt();
        while(true){
            if(numero == 0){break;}
            System.out.println("Introduzca otro numero: ");
            numero = scn1.nextInt();
        }
        /*EJERCICIO2
        Escribe un programa que muestre los números del 1 al 10, excepto los múltiplos de 3. Usa un bucle for con continue.
         */
        for(int i=1;i<=10;i++){
            if(i%3 == 0){
                continue;
            }
            System.out.println(i);
        }
        /*EJERCICIO3
        Haz un programa que busque el número 7 entre los números del 1 al 20. Cuando lo encuentre, debe mostrar un mensaje y terminar el bucle con break.
         */
        for(int a=0;a<20;a++){
            System.out.println("Aun no he encontrado el 7 :(");
            if(a==7){//no se si es muy correcto romper un bucle dentro de un condicional
                System.out.println("He econtrado el 7, rompo el bucle");
                break;
            }
        }




    }
}
