package com.mycompany.hotel;
import java.util.*;
public class HabitacionSimple implements Habitaciones {
    final private int precio=50; 
    private static int nHabitaciones=15;
    private List<Integer> NHabi =new ArrayList<>();
    public HabitacionSimple(){
        Collections.addAll(NHabi,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
    };
    @Override
    public void getCaracteristicas() {
        System.out.println("Habitación Simple: Cama individual, baño privado, Wi-Fi gratis.");
    }
    @Override
    public int disponibles(){
        int newH;
        newH = NHabi.get(0);
        NHabi.remove(newH);
        nHabitaciones--;
        return newH;
    }
    @Override
    public void liberar(int n){
        nHabitaciones++;
        NHabi.add(n);
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
