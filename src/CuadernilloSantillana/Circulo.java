package CuadernilloSantillana;

public class Circulo {
    // Constante PI
    public static final double PI = 3.1416;

    // Atributo: radio del círculo
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Metodo para calcular el área
    public double calcularArea() {
        return PI * radio * radio;
    }
}


