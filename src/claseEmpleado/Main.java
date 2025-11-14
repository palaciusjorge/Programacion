package claseEmpleado;

public class Main {
    public static void main(String[] args) {

        // Crear un empleado
        Empleado emp1 = new Empleado("Ana López", "12345678A", 1500);

        // Mostrar información inicial
        emp1.mostrarEmpleado();

        // Aumentar salario un 10%
        System.out.println("\n--- Aumentando salario 10% ---");
        emp1.aumentarSalario(10);

        // Mostrar información después del aumento
        emp1.mostrarEmpleado();

        // Mostrar salario anual
        System.out.println("\nSalario anual: " + emp1.getSalarioAnual());
    }
}

