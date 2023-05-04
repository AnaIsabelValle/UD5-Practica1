import com.hiperdino.utilidades.GeneradorNombresAleatorios;
import com.hiperdino.valledeguerra.Cajero;
import com.hiperdino.valledeguerra.Cliente;

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
            System.out.print("Seleccione una opción: ");
            System.out.println("******ooOOOOoo******");

            String opcion = teclado.nextLine();

            switch (opcion) {
                case "A":
                    if (cajaAbierta) {
                        System.out.println("La caja ya estaba abierta.");
                    } else {
                        cajaAbierta = true;
                        System.out.println("La caja acaba de abrirse.");
                    }
                    break;

                case "B":
                    if (cajaAbierta) {
                        Cliente cliente = new Cliente(GeneradorNombresAleatorios.getRandomNombre(),
                                GeneradorNombresAleatorios.getRandomNombre());
                        cajero.añadirCliente( cliente);
                        System.out.println("Cliente añadido a la cola:\n" + cliente.toString());
                    } else {
                        System.out.println("La caja está cerrada. No se puede añadir clientes.");
                    }
                    break;

                case "C":
                    Cliente clienteAtendido = cajero.atenderCliente();
                    if (clienteAtendido == null) {
                        System.out.println("No hay clientes en la cola.");
                    } else {
                        System.out.println("Cliente atendido:\n" + clienteAtendido.toString());
                    }
                    break;

                case "D":
                    System.out.println("Clientes en la cola del cajero " + cajero.getNumeroCajero() + ":");
                    System.out.println(cajero.listarClientesEnCola());
                    break;

                case "E":
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

