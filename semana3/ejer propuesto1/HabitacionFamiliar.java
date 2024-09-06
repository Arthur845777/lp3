package com.mycompany.hotel;
import java.util.*;
public class HabitacionFamiliar implements Habitaciones {
    final private int precio=100; 
    private static int nHabitaciones=10;
    private List<Integer> NHabi =new ArrayList<>();
    public HabitacionFamiliar(){
        Collections.addAll(NHabi,16,17,18,19,20,21,22,23,24,25);    
    };
    @Override
    public void getCaracteristicas() {
        System.out.println("Habitación Familiar: 2 camas dobles, espacio amplio, ideal para familias.");
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
