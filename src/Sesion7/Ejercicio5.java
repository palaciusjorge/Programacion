package Sesion7;

public class Ejercicio5 {
    public static void main(String[] args) {
        String nombre = null;

        try{

            System.out.println("La logitud del texto es : " + nombre.length());
        }catch(NullPointerException e){

            System.err.println("Estas intentando imprimir la longitud de una cadena vacia.");
        }
    }
}
