package com.hiperdino.utilidades;

import java.util.Random;

public class GeneradorProductoAleatorio {

    private static String[] productos = {
            "Papas",
            "Huevos",
            "Agua",
            "Pollo",
            "Pan",
            "Queso",
            "Mantequilla",
            "Plátanos",
            "Manzana",
            "Tomate",
            "Lechuga",
            "Leche"
    };

    private static Random productoAleatorio = new Random();

    public static String getRandomProductos() {
        int index = productoAleatorio.nextInt(productos.length);
        return productos[index];
    }

}
