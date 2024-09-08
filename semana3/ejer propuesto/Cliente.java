// Clase que representa a los clientes del hotel
package com.mycompany.hotel;
import java.util.*;
public class Cliente implements persona {
    private String nombre;  // Nombre del cliente
    private String Contacto;  // Contacto del cliente
    private int numH=0;  // Número de habitaciones ocupadas
    private int deuda;  // Deuda total del cliente
    private int dias;  // Días de estancia
    private List<String> Habitaciones =new ArrayList<>();  // Tipos de habitaciones ocupadas
    private List<Integer> NHabi =new ArrayList<>();  // Números de habitaciones ocupadas

    // Constructor para inicializar el cliente
    public Cliente(String nombre, String contacto){
        this.nombre = nombre;
        this.Contacto = contacto;
    }

    // Obtener la deuda del cliente
    public int getDeuda(){
        return deuda;
    }

    // Obtener el nombre del cliente
    public String getNombre(){
        return nombre;
    }

    // Calcular la deuda del cliente en función de los días de estancia y el costo
    public void setDeuda(int costo, int dia){
        this.dias = dia;
        deuda += costo * dia;
    }

    // Obtener el número de habitaciones ocupadas
    public int getNumH(){
        return numH;
    }

    // Añadir una habitación ocupada por el cliente
    public void setNumH(String type, int Num){
        numH++;
        Habitaciones.add(type);
        NHabi.add(Num);
    }

    // Obtener el número total de habitaciones ocupadas
    public int getHabi(){
        return Habitaciones.size();
    }

    // Obtener la lista de habitaciones ocupadas
    public List getHabitaciones(){
        return Habitaciones;
    }

    // Liberar una habitación ocupada por el cliente
    public int LiberarH(String habi){
        int indice = Habitaciones.indexOf(habi);  // Encontrar el índice de la habitación
        numH--;
        Habitaciones.remove(habi);  // Eliminar la habitación de la lista
        return indice;  // Retornar el índice eliminado
    }
}
