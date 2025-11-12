package CuadernilloSantillana;

public class divisiblesPor3o5 {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++) {
            if(i%3 == 0 & i%5 == 0){
                System.out.println(i + " es divisible por 3 y 5");
            } else if (i%3 == 0) {
                System.out.println(i + " es divisible por 3");
            } else if (i%5 == 0) {
                System.out.println(i + " es divisible por 5");
            }
        }

    }

}
