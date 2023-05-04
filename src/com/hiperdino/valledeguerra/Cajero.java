package com.hiperdino.valledeguerra;

import java.util.Queue;

public class Cajero {

    private int numeroCajero;
    private Queue<Cliente> colaClientes;

    public Cajero(int numeroCajero, Queue<Cliente> colaClientes) {
        this.numeroCajero = numeroCajero;
        this.colaClientes = colaClientes;
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

}
