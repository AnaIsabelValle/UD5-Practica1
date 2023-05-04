package com.hiperdino.valledeguerra;

import java.util.Stack;

public class Cliente {

    private String nombre;
    private Stack<String> cesta;

    public Cliente(String nombre, Stack<String> cesta) {
        this.nombre = nombre;
        this.cesta = cesta;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cesta = new Stack<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void añadirProducto(String producto) {
        cesta.add(producto);
    }

    public String quitarProducto() {
        return cesta.pop();
    }

    public int getTotalProductosEnCesta() {
        return cesta.size();
    }
}

