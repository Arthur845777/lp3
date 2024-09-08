package com.mycompany.hotel;

// Librería necesaria para la entrada de datos desde consola
import java.util.Scanner;

// Clase principal que contiene el método main para ejecutar el programa
public class Hotel {
    public static void main(String[] args) {
        // Crear instancia del Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Crear instancias de clases relacionadas a la gestión de habitaciones y generación de informes
        GestionH gestionar = new GestionH();  // Relación con la clase GestiónH, que gestiona las reservas
        GeneracionInformes informes = new GeneracionInformes();  // Relación con la clase GeneracionInformes

        // Arreglo de clientes con un tamaño predefinido de 30
        Cliente[] clientes = new Cliente[30];
        int clienteCount = 0;  // Contador de clientes registrados
        
        // Crear instancias de personal para la gestión del hotel
        Personal personal1 = new Personal("Carlos Martínez", "111222333");
        Personal personal2 = new Personal("Laura López", "444555666");
        
        // Bucle para mostrar un menú interactivo al usuario
        while (true) {
            // Mostrar opciones al usuario
            System.out.println("=== Menú de Gestión del Hotel ===");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Reservar habitación");
            System.out.println("3. Cancelar reservación");
            System.out.println("4. Generar informe de clientes");
            System.out.println("5. Mostrar información del personal");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();  // Leer la opción del usuario
            sc.nextLine(); // Limpiar el buffer de entrada
            
            switch (opcion) {
                case 1:
                    // Lógica para registrar un nuevo cliente
                    if (clienteCount < clientes.length) {
                        System.out.println("Ingrese su nombre:");
                        String name = sc.nextLine();
                        System.out.println("Ingrese su correo o número de celular:");
                        String contacto = sc.nextLine();
                        clientes[clienteCount] = new Cliente(name, contacto);  // Crear un nuevo cliente
                        clienteCount++;  // Aumentar el contador de clientes
                        System.out.println("Cliente registrado exitosamente.");
                    } else {
                        System.out.println("No se pueden registrar más clientes.");
                    }
                    break;
                
                case 2:
                    // Lógica para reservar una habitación
                    if (clienteCount > 0) {
                        System.out.println("Ingrese el número del cliente (0 a " + (clienteCount - 1) + "):");
                        int index = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer de entrada
                        if (index >= 0 && index < clienteCount) {
                            gestionar.Reservar(clientes, index);  // Llama al método reservar de GestionH
                        } else {
                            System.out.println("Índice de cliente inválido.");
                        }
                    } else {
                        System.out.println("No hay clientes registrados.");
                    }
                    break;
                
                case 3:
                    // Lógica para cancelar una reservación
                    if (clienteCount > 0) {
                        System.out.println("Ingrese el número del cliente (0 a " + (clienteCount - 1) + "):");
                        int index = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer de entrada
                        if (index >= 0 && index < clienteCount) {
                            gestionar.Cancelar(clientes, index);  // Llama al método cancelar de GestionH
                        } else {
                            System.out.println("Índice de cliente inválido.");
                        }
                    } else {
                        System.out.println("No hay clientes registrados.");
                    }
                    break;
                
                case 4:
                    // Lógica para generar informe de clientes
                    if (clienteCount > 0) {
                        informes.generarInformeClientes(clientes, 0);  // Llama al método generarInformeClientes
                    } else {
                        System.out.println("No hay clientes registrados.");
                    }
                    break;
                
                case 5:
                    // Mostrar información del personal
                    System.out.println("Personal 1: " + personal1.getNombre() + ", Habitaciones Asignadas: " + personal1.getHabitacionesAsignadas());
                    System.out.println("Personal 2: " + personal2.getNombre() + ", Habitaciones Asignadas: " + personal2.getHabitacionesAsignadas());
                    break;
                
                case 6:
                    // Opción para salir del sistema
                    System.out.println("Saliendo del sistema.");
                    sc.close();  // Cerrar el scanner
                    return;
                
                default:
                    // Mensaje si la opción es inválida
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
