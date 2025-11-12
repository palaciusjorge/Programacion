package CuadernilloSantillana;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        double r = sc.nextDouble();

        Circulo c = new Circulo(r);
        System.out.println("El área del círculo es: " + c.calcularArea());
    }
}

