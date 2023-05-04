package com.hiperdino.valledeguerra;

import com.hiperdino.utilidades.GeneradorProductoAleatorio;

import java.util.Stack;

public class Cliente {

    private String nombre;
    private Stack<String> cesta;
    private int totalProductos;

    public Cliente(String nombre, Stack<String> cesta) {
        this.nombre = nombre;
        this.cesta = cesta;
    }

    public Cliente(String nombre, int numeroProductos) {
        this.nombre = nombre;
        this.cesta = new Stack<>();
        this.totalProductos = numeroProductos;
        for (int i = 0; i < numeroProductos; i++) {
            String producto = GeneradorProductoAleatorio.getRandomProductos();
            this.cesta.add(producto);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getTotalProductos() {
        return totalProductos;
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

    @Override
    public String toString() {
        String cliente = "Cliente\n";
        cliente += "===================================\n";
        cliente += "* Nombre: " + this.nombre + ":\n";
        cliente += "* Total de productos: " + this.totalProductos + "\n";
        cliente += "* Lista de artículos en la cesta : \n";
        for (String producto : cesta) {
            cliente += producto + "\n";
        }
        cliente += "===================================\n";
        return cliente;
    }

}

