package Clase2;
import java.util.Scanner;
public class MainClase2 {
    public static void main(String[]args) {
        //EJERCICIO1
        final double gravedad = 9.81;
        System.out.println(gravedad);

        //EJERCICIO2
        int a = 25, b = 7;
        double adouble, bdouble;
        adouble = a;
        bdouble = b;
        System.out.println("Suma: " +(a + b));
        System.out.println("Resta: " +(a - b));
        System.out.println("Division: "+ (adouble/bdouble));
        System.out.println("Multiplicacion: "+ (a*b));
        System.out.println("Modulo: "+(a%b));

        //EJERCICIO3
        int edad =21;
        System.out.println("Es mayor de edad? " + (edad >=18));

        //EJERCICIO4
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Introduzca un numero entero: ");
        numero1 = scn1.nextInt();
        System.out.println("Introduzca otro numero entero: ");
        numero2 = scn2.nextInt();
        //Estas lineas de codigo necesitarian un control de entrada de datos (que no lo introduzcan en formato String, etc.
        //Tambien podria imprimir unicamente el resultado utilizando condicionales, pero no se si excede los conocimientos para los que esta diseñado este ejercicio.
        System.out.println("Es " + numero1 + " mayor que " + numero2 + "? " + (numero1 > numero2));
        System.out.println("Es " + numero2 + " mayor que " + numero1 + "? " + (numero2 > numero1));
        System.out.println("Es " + numero1 + " igual que " + numero2 + "? " + (numero1 == numero2));

        //EJERCICIO5
        System.out.println((5 > 3) && (10 < 20) ); //Espero un booleano porque son operadores logicos

        //EJERCICIO6
        System.out.println(((5 > 3) && (10 < 20)) && ((5 > 3) || (10 > 20))); //Espero un booleano porque son operadores logicos
        /*En ambos casos el resultado sera true, porque el primero evalua que 5 sea mayor que tres y 10 menor que 20;
        el segundo evalua lo mencionado y ademas que 5 sea mayor que 3 o 10 mayor que 20, como se cumple una de las dos
        es tambien true, por lo tanto true y true imprime true
         */

        //EJERCICIO7
        int x, y, z;
        x = 10;
        y = 20;
        z = 30;
        System.out.println("Es la suma " + x+ " + "+ y+" igual a " + z+"? " + (x+y==z));
        System.out.println("Es la suma " + x+ " + "+ y+" mayor que " + z+"? " + (x+y>z));
        System.out.println("Es la suma " + x +" + "+ y+" menor que " + z+"? " + (x+y<z));

        //EJERCICIO8
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        int numero3, numero4;
        System.out.println("Introduzca un numero entero: ");
        numero3 = scn3.nextInt();
        System.out.println("Introduzca otro numero entero: ");
        numero4 = scn4.nextInt();
        System.out.println("Los numeros que ha introducido son multiplos? " + (numero3%numero4 == 0));

        //EJERCICIO9
        Scanner scn5 = new Scanner(System.in);
        int numero5;
        System.out.println("Introduzca un numero entero: ");
        numero5 = scn5.nextInt();
        System.out.println("Introdujo un numero par? " + (numero5%2 == 0));

        //EJERCICIO10
        Scanner scn6 = new Scanner(System.in);
        final double tasaCambio = 1.12;
        int numero6;
        System.out.println("Introduzca cuantos dolares quiere cambiar a euros: ");
        numero6 = scn6.nextInt();
        System.out.println("Usted recibira "+ (numero6*tasaCambio) + "euros");
        System.out.println("Estoy probando como actualizar facilmente en github");
    }
}

