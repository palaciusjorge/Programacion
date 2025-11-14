package claseEmpleado;

public class Empleado {
    private String nombre;
    private String dni;
    private double salarioMensual;
    public Empleado(String nombre, String dni, double salarioMensual){
        this.nombre = nombre;
        this.dni = dni;
        this.salarioMensual = salarioMensual;
    }
    public void aumentarSalario(double porcentaje){
        salarioMensual += salarioMensual*(porcentaje/100);
    }
    public double getSalarioAnual(){
        return salarioMensual*12;
    }
    public void mostrarEmpleado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Salario mensual: "+salarioMensual);
    }
}
