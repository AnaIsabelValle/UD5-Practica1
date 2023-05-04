import com.hiperdino.valledeguerra.Cajero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Cajero cajero = new Cajero(1);
        boolean cajaAbierta = false;

        while (true) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir un nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar supermercado");
            System.out.print("Seleccione una opción: ");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    if (cajaAbierta) {
                        System.out.println("La caja ya estaba abierta.");
                    } else {
                        cajaAbierta = true;
                        System.out.println("La caja ha sido abierta.");
                    }
                    break;

                case 2:
                    if (cajaAbierta) {
                        Cliente cliente = new Cliente(NombreAleatorio.obtenerNombreAleatorio(), ProductosAleatorios.obtenerNumeroProductosAleatorios());
                        cajero.anadirCliente(cliente);
                        System.out.println("Cliente añadido a la cola:\n" + cliente.toString());
                    } else {
                        System.out.println("La caja está cerrada. No se puede añadir clientes.");
                    }
                    break;

                case 3:
                    Cliente clienteAtendido = cajero.atenderCliente();
                    if (clienteAtendido == null) {
                        System.out.println("No hay clientes en la cola.");
                    } else {
                        System.out.println("Cliente atendido:\n" + clienteAtendido.toString());
                    }
                    break;

                case 4:
                    System.out.println("Clientes en la cola del cajero " + cajero.getNumeroCajero() + ":");
                    System.out.println(cajero.listarClientesEnCola());
                    break;

                case 5:
                    if (cajaAbierta) {
                        cajero.cerrarCaja();
                        cajaAbierta = false;
                    }
                    System.out.println("¡Hasta pronto!");
                    return;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}

    }
            }
