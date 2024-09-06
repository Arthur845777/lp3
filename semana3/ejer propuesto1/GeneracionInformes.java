package com.mycompany.hotel;
import java.util.*;
public class GeneracionInformes {
    // Generar informe sobre los clientes
    public void generarInformeClientes(Cliente clientes[], int index) {
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Número de habitaciones ocupadas: " + cliente.getHabi());
            System.out.println("Deuda total: " + cliente.getDeuda());
            System.out.println("Habitaciones ocupadas: " + cliente.getHabitaciones());
            System.out.println();
        }
    }
}
