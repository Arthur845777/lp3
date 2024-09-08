// Clase que representa una suite de lujo
package com.mycompany.hotel;
import java.util.*;
public class Suite implements Habitaciones {
    final private int precio=150;  // Precio de la suite
    private static int nHabitaciones=5;  // Número de suites disponibles
    private List<Integer> NHabi =new ArrayList<>();  // Lista de números de suites

    // Constructor que inicializa los números de suites
    public Suite(){
        Collections.addAll(NHabi,26,27,28,29,30);
    };

    @Override
    public void getCaracteristicas() {
        System.out.println("Suite: 1 cama King size, jacuzzi, vistas panorámicas, ideal para estancias de lujo.");
    }

    @Override
    public int disponibles(){
        int newH = NHabi.get(0);  // Obtener el primer número disponible
        NHabi.remove(newH);  // Eliminar de la lista para indicar que ya no está disponible
        nHabitaciones--;
        return newH;
    }

    @Override
    public void liberar(int n){
        nHabitaciones++;  // Incrementar el número de suites disponibles
        NHabi.add(n);  // Añadir el número de suite liberado
    }

    @Override
    public int getNhabi(){
        return nHabitaciones;
    }

    @Override
    public int getPrecio(){
        return precio;
    }
}
