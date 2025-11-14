package ejercicioBanco;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Crear banco
        Banco banco = new Banco("Banco Central");

        // Crear clientes
        Cliente c1 = new Cliente("Ana García", "123A", 1000);
        Cliente c2 = new Cliente("Luis Pérez", "456B", 500);
        Cliente c3 = new Cliente("Marta López", "789C", 200);

        // Agregar clientes al banco
        banco.agregarCliente(c1);
        banco.agregarCliente(c2);
        banco.agregarCliente(c3);

        // Mostrar todos los clientes
        System.out.println("=== LISTA DE CLIENTES ===");
        banco.mostrarTodosLosClientes();

        // Buscar cliente por DNI
        System.out.println("\n=== BUSCANDO CLIENTE 456B ===");
        Cliente encontrado = banco.buscarClientePorDNI("456B");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        // Transferencia entre clientes
        System.out.println("\n=== TRANSFERENCIA DE 200 DE 123A → 456B ===");
        banco.transferir("123A", "456B", 200);

        // Verificar cambios después de la transferencia
        System.out.println("\n=== ESTADO DE CLIENTES DESPUÉS DE TRANSFERENCIA ===");
        banco.mostrarTodosLosClientes();

        // Intentar transferir más de lo disponible
        System.out.println("\n=== TRANSFERENCIA FALLIDA DE 2000 DE 789C → 123A ===");
        banco.transferir("789C", "123A", 2000);
    }
}
