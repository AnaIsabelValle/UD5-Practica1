import com.hiperdino.utilidades.GeneradorNombresAleatorios;
import com.hiperdino.valledeguerra.Cajero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Cajero cajero = new Cajero(1);
        boolean cajaAbierta = false;

        while (!cajaAbierta) {
            System.out.println("******ooOOOOoo******");
            System.out.println("MENU PRINCIPAL");
            System.out.println("A. Abrir caja");
            System.out.println("B. Añadir un nuevo cliente a la cola");
            System.out.println("C. Atender un cliente");
            System.out.println("D. Ver clientes pendientes");
            System.out.println("E. Cerrar supermercado");
            System.out.println("Seleccione una opción: ");
            System.out.println("******ooOOOOoo******");

            String opcion = teclado.nextLine();

            switch (opcion) {
                case "A":
                    if (!cajaAbierta) {
                        System.out.println("La caja acaba de abrirse.");
                    } else {
                        cajaAbierta = true;
                        System.out.println("La caja ya estaba abierta.");
                    }
                    break;

                case "B":
                    if (cajaAbierta) {
                        System.out.println("La caja está cerrada, no se puede añadir clientes");
                    } else {
                        String nuevoCliente = GeneradorNombresAleatorios.getRandomNombre();
                        cajero.añadirCliente(null);
                        System.out.println("Nuevo cliente añadido a la cola: " + nuevoCliente);
                    }
                    break;

                case "C":
                    cajero.atenderCliente();
                    break;

                case "D":
                    cajero.listadoClientes();
                    break;

                case "E":
                    if (cajaAbierta) {
                        System.out.println("La caja está cerrada");
                        cajaAbierta = false;
                    }
                    System.out.println("¡Hasta pronto!");
                    return;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        teclado.close();
    }
}

