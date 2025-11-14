package clasePelota;

public class Main {
    public static void main(String[] args) {

        Pelota pelota = new Pelota("Roja", 15.5);

        // Hacerla rebotar 3 veces
        pelota.rebotar();
        pelota.rebotar();
        pelota.rebotar();

        System.out.println("Rebotes actuales: " + pelota.getRebotes());

        // Reiniciar contador
        pelota.reiniciar();

        System.out.println("Rebotes después de reiniciar: " + pelota.getRebotes());
    }
}