public class Coche {
    private String marca;
    private String modelo;
    private String matricula;
    private double kilometraje;
    public Coche(String marca, String modelo, String matricula, double kilometraje){
        this.modelo = modelo;
        this.marca = marca;
        this.matricula = matricula;
        this.kilometraje = kilometraje;
    }
    public void recorrer(double kilometros){
        this.kilometraje += kilometros;
    }
    public void infoCoche(){
        System.out.println("Coche de la marca "+ marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Con matricula: " + matricula);
        System.out.println("Y kilometraje: " + kilometraje);
    }
}
