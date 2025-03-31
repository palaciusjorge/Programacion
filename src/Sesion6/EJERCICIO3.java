package Sesion6;

public class EJERCICIO3 {
    public static void main(String[] args) {
        /*EJERCICIO3
        Haz un programa que busque el número 7 entre los números del 1 al 20. Cuando lo encuentre, debe mostrar un mensaje y terminar el bucle con break.
         */
        for (int a = 0; a < 20; a++) {
            System.out.println("Aun no he encontrado el 7 :(");
            if (a == 7) {//no se si es muy correcto romper un bucle dentro de un condicional
                System.out.println("He encontrado el 7, rompo el bucle");
                break;
            }
        }
    }
}
