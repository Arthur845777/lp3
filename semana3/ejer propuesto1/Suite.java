package com.mycompany.hotel;
import java.util.*;

public class Suite implements Habitaciones {
    final private int precio=250; 
    private static int nHabitaciones=5;
    private List<Integer> NHabi =new ArrayList<>();
    public Suite(){
        Collections.addAll(NHabi,26,27,28,29,30);    
    };
    @Override
    public void getCaracteristicas() {
        System.out.println("Suite: Cama king size, sala de estar, minibar, jacuzzi.");
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
