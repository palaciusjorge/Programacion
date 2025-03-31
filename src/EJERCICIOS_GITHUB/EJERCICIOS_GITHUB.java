package EJERCICIOS_GITHUB;
import java.util.Scanner;
public class EJERCICIOS_GITHUB {
    public static void main(String[] args) {
        //EJERCICIO 1: CLASIFICACIÓN DE EDAD
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su edad :");
        int edad = scanner.nextInt();
        if(edad < 18){
            System.out.println("Eres menor de edad.");
        } else if (18 <= edad && edad < 64){
            System.out.println("Eres una persona adulta.");
        }
        else{
            System.out.println("Eres una persona en edad de jubilacion.");
        }

        //EJERCICIO 2:Contador de vocales
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduzca una palabra :");
        String palabra = scanner1.nextLine();
        String palabraProcesada = palabra.toLowerCase();
        int contadorVocales = 0;
        for (int posicion = 0; posicion < palabraProcesada.length(); posicion++){
            if("aeiou".indexOf(palabraProcesada.charAt(posicion)) != -1){
                contadorVocales ++;
            }

        }
        System.out.println("Esta palabra tiene " + contadorVocales + " vocales.");

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

        // EJERCICIO 4 : Imprimir numeros pares

        Scanner scanner5 = new Scanner(System.in);
        int rango;
        System.out.println("Introduzca un numero :");
        rango = scanner5.nextInt();
        for(int i = 1;i < rango; i+=2){
            System.out.println((i+1) + "");
        }
        // EJERCICIO 5 : Contraseña con intentos limitados

        String password = "Password12";
        int attempts = 3;
        Scanner scanner6 = new Scanner(System.in);
        String introducedPassword;
        for (int i = 0; i < attempts; i++){
            System.out.println("Introduzca la contraseña :");
            introducedPassword = scanner6.nextLine();
            if(introducedPassword.equals(password)){
                System.out.println("Contraseña correcta. Acceso al sistema concedido.");
                break;
            }else{
                attempts --;
                System.out.println("Esa no es la contraseña, te quedan :" + attempts + " intentos");

            }

        }

        // EJERCICIO 6 : Adivina el numero






    }
}
