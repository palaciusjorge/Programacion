package funciones;

public class funciones {
    public static int sumar(int a, int b){
        return a + b;
    }
    public static boolean esPar (int a){
        if (a%2 == 0){
            return true;
        }
        return false;
    }
    public static void saludo (String nombre, int edad){
        System.out.println("Hola " + nombre + " que bien llevas tus " + edad + " años.");
    }
    public static int sumatorio(int[] numeros){
        int suma = 0;
        for(int i:numeros){
            suma += i;
        }
        return suma;
    }

}
