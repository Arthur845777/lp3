package com.mycompany.hotel;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Crear instancias de las habitaciones
        GestionH gestionar = new GestionH();
        GeneracionInformes informes = new GeneracionInformes();
        
        // Crear un arreglo de clientes
        Cliente[] clientes = new Cliente[30];
        int clienteCount = 0;  // Contador para clientes
        
        // Crear instancias de personal
        Personal personal1 = new Personal("Carlos Martínez", "111222333");
        Personal personal2 = new Personal("Laura López", "444555666");
        
        // Menú de opciones
        while (true) {
            System.out.println("=== Menú de Gestión del Hotel ===");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Reservar habitación");
            System.out.println("3. Cancelar reservación");
            System.out.println("4. Generar informe de clientes");
            System.out.println("5. Mostrar información del personal");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            
            switch (opcion) {
                case 1:
                    // Registrar cliente
                    if (clienteCount < clientes.length) {
                        System.out.println("Ingrese su nombre:");
                        String name = sc.nextLine();
                        System.out.println("Ingrese su correo o número de celular:");
                        String contacto = sc.nextLine();
                        clientes[clienteCount] = new Cliente(name, contacto);
                        clienteCount++;
                        System.out.println("Cliente registrado exitosamente.");
                    } else {
                        System.out.println("No se pueden registrar más clientes.");
                    }
                    break;
                
                case 2:
                    // Reservar habitación
                    if (clienteCount > 0) {
                        System.out.println("Ingrese el número del cliente (0 a " + (clienteCount - 1) + "):");
                        int index = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer
                        if (index >= 0 && index < clienteCount) {
                            gestionar.Reservar(clientes, index);
                        } else {
                            System.out.println("Índice de cliente inválido.");
                        }
                    } else {
                        System.out.println("No hay clientes registrados.");
                    }
                    break;
                
                case 3:
                    // Cancelar reservación
                    if (clienteCount > 0) {
                        System.out.println("Ingrese el número del cliente (0 a " + (clienteCount - 1) + "):");
                        int index = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer
                        if (index >= 0 && index < clienteCount) {
                            gestionar.Cancelar(clientes, index);
                        } else {
                            System.out.println("Índice de cliente inválido.");
                        }
                    } else {
                        System.out.println("No hay clientes registrados.");
                    }
                    break;
                
                case 4:
                    // Generar informe de clientes
                    if (clienteCount > 0) {
                        informes.generarInformeClientes(clientes, 0);
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
                    // Salir
                    System.out.println("Saliendo del sistema.");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
