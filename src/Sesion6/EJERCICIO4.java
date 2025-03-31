package Sesion6;

public class EJERCICIO4 {
    public static void main(String[] args) {
        /*EJERCICIO 4
        Muestra las letras de la palabra "PROGRAMACION", pero omite las vocales usando continue.
         */
        String palabra = "PROGRAMACION";
        for (int contador = 0; contador < palabra.length(); contador++) {
            if ("AEIOU".indexOf(palabra.charAt(contador)) != -1){
                continue;
            }
            System.out.print(palabra.charAt(contador));

        }
    }
}
