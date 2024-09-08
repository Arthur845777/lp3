// Clase para generar informes de clientes
package com.mycompany.hotel;
import java.util.*;

public class GeneracionInformes {
    // Genera un informe sobre los clientes, mostrando su nombre, habitaciones ocupadas y deuda total
    public void generarInformeClientes(Cliente[] clientes, int clienteCount) {
        System.out.println("=== Informe de Clientes ===");
        for (int i = 0; i < clienteCount; i++) {
            Cliente cliente = clientes[i];
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Número de habitaciones ocupadas: " + cliente.getHabi());
            System.out.println("Deuda total: " + cliente.getDeuda());
        }
    }
}
