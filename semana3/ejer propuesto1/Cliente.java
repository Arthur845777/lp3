package com.mycompany.hotel;
import java.util.*;
public class Cliente implements persona {
    private String nombre;
    private String Contacto;
    private int numH=0;
    private int deuda;
    private int dias;
    private List<String> Habitaciones =new ArrayList<>();
    private List<Integer> NHabi =new ArrayList<>();
    public Cliente(String nombre, String contacto){
        this.nombre=nombre;
        this.Contacto=contacto;
    }
    public int getDeuda(){
        return deuda;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDeuda(int costo, int dia){
        this.dias=dia;
        int total;
        total=costo*dia;
        deuda+=total;
    }
    public int getNumH(){
        return numH;
    }
    public void setNumH(String type, int Num){
        numH++;
        Habitaciones.add(type);
        NHabi.add(Num);
    }
    public int getHabi(){
        return Habitaciones.size();
    }
    public List getHabitaciones(){
        return Habitaciones;
    }
    public int LiberarH(String habi){
        int indice;
        indice=Habitaciones.indexOf(habi);
        numH--;
        Habitaciones.remove(habi);
        return indice;
    }
}
