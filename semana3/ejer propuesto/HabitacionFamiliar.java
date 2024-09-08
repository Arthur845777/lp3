// Clase que representa una habitación familiar
package com.mycompany.hotel;
import java.util.*;
public class HabitacionFamiliar implements Habitaciones {
    final private int precio=100;  // Precio de la habitación familiar
    private static int nHabitaciones=10;  // Número de habitaciones familiares disponibles
    private List<Integer> NHabi =new ArrayList<>();  // Lista de números de habitaciones

    // Constructor que inicializa los números de habitación
    public HabitacionFamiliar(){
        Collections.addAll(NHabi,16,17,18,19,20,21,22,23,24,25);    
    };

    @Override
    public void getCaracteristicas() {
        System.out.println("Habitación Familiar: 2 camas dobles, espacio amplio, ideal para familias.");
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
        nHabitaciones++;  // Incrementar el número de habitaciones disponibles
        NHabi.add(n);  // Añadir el número de habitación liberado
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
