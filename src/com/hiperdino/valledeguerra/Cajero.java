package com.hiperdino.valledeguerra;

import java.util.Queue;

public class Cajero {

    private int numeroCajero;
    private Queue<Cliente> colaClientes;

    public Cajero(int numeroCajero, Queue<Cliente> colaClientes) {
        this.numeroCajero = numeroCajero;
        this.colaClientes = colaClientes;
    }
}
