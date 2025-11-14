package ejercicioBanco;

public class Cliente {
    //mostrarInfo(): imprime por consola los datos del cliente y su saldo.
    private String nombre;
    private String dni;
    private double saldo;
    public Cliente(String nombre, String dni, double saldoInicial){
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldoInicial;
    }
    public String getDni(){
        return dni;
    }
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double cantidad){
        saldo += cantidad;
    }
    public boolean retirar(double cantidad){
        if(cantidad <= saldo){
            this.saldo -= cantidad;
            return true;
        }return false;
    }
    public void mostrarInfo(){
        System.out.println("Cliente: "+nombre);
        System.out.println("DNI: "+dni);
        System.out.println("Saldo disponible: "+saldo);
    }

}
