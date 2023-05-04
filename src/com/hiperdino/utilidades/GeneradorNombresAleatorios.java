package com.hiperdino.utilidades;

import java.util.Random;

public class GeneradorNombresAleatorios {

    private static final String[] nombres = {
            "Ana", "Guillermo", "Margarita", "Juan",
            "Aroa", "Álvaro", "Gustavo", "Idaira", "Keira", "Nayara", "Alberto", "Roger",
            "Sofía", "Valentina", "Leyre", "Omaira", "Aitor", "Desi", "Héctor",
            "Zoe"
    };

    private static final Random nombreAleatorio = new Random();

    public static String getRandomNombre() {
        int index = nombreAleatorio.nextInt(nombres.length);
        return nombres[index];
    }

}
