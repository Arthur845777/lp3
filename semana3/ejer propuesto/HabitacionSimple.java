package com.mycompany.hotel;
import java.util.*;
public class HabitacionSimple implements Habitaciones {
    final private int precio=50;  // Precio de la habitación familiar
    private static int nHabitaciones=15;  // Número de habitaciones familiares disponibles
    private List<Integer> NHabi =new ArrayList<>();  // Lista de números de habitaciones
    public HabitacionSimple(){
        Collections.addAll(NHabi,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15); // Lista de números de habitaciones
    };
    
    // Constructor que inicializa los números de habitación
    @Override
    public void getCaracteristicas() {
        System.out.println("Habitación Simple: Cama individual, baño privado, Wi-Fi gratis.");
    }
    @Override
    public int disponibles(){
        int newH;
        newH = NHabi.get(0); // Obtener el primer número disponible
        NHabi.remove(newH); // Eliminar de la lista para indicar que ya no está disponible
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
