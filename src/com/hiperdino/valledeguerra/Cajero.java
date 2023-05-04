package com.hiperdino.valledeguerra;

import java.util.Queue;
public class Cajero {

    private final int numeroCajero;
    private final Queue<Cliente> colaClientes;

    public Cajero(int numeroCajero, Queue<Cliente> colaClientes) {
        this.numeroCajero = numeroCajero;
        this.colaClientes = colaClientes;
    }

    public int getNumeroCajero() {
        return numeroCajero;
    }

    public void añadirCliente(Cliente cliente) {
        this.colaClientes.add(cliente);
    }

    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            Cliente cliente = colaClientes.poll();
            System.out.println("El cajero " + numeroCajero + " está atendiendo al cliente " + cliente.getNombre());
        } else {
            System.out.println("La cola de clientes del cajero " + numeroCajero + " está vacía.");
        }
    }

    public void listadoClientes() {
        System.out.println(" Cajero\n");
        System.out.println(" ===================================");
        System.out.println(" * Número de caja: " + this.numeroCajero);
        System.out.println(" * Total de clientes: " + this.colaClientes.size());
        System.out.println(" * Clientes en la fila: ");
        for (Cliente cliente : this.colaClientes) {
            System.out.println(cliente.getNombre());
        }
        System.out.println(" ===================================");
    }

    @Override
    public String toString() {
        return "Cajero\n" +
                "===================================\n" +
                "* Número de caja: " + this.numeroCajero + ":\n" +
                "* Total de clientes: " + this.colaClientes.size() + "\n" +
                "* Clientes en la fila:\n" +
                "===================================\n";
    }
}
