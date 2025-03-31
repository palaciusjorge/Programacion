package Sesion6;
import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        /*EJERCICIO 6 :
        Solicita una palabra al usuario y pide una posición. Intenta mostrar el carácter en esa posición usando try-catch.
         Si se produce un error, muestra un mensaje.
         */
        String palabra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una palabra: ");
        palabra = scanner.nextLine();
        int posicion;
        System.out.println("Introduzca la posicion de la cual quiere saber la letra :");
        posicion = scanner.nextInt() - 1;
        try{
            System.out.println("El caracter de la posicion : " + (posicion + 1) + " es : " + palabra.charAt(posicion));
        }catch(IndexOutOfBoundsException ex){
            System.err.println("La posicion seleccionada no entra en el rango de numero de letras de la palabra introducida");

        }

    }
}
