package com.mycompany.hotel;
import java.util.*;
public class Personal implements persona {
    private String nombre;
    private String Contacto;
    private List<Integer> habitacionesAsignadas;
    // Constructor para inicializar el nombre, contacto y lista de habitaciones asignadas
    public Personal(String nombre, String contacto) {
        this.nombre = nombre;
        this.Contacto = contacto;
        this.habitacionesAsignadas = new ArrayList<>();
    }
    // Obtener el nombre del personal
    public String getNombre() {
        return nombre;
    }
    // Obtener el contacto del personal
    public String getContacto() {
        return Contacto;
    }
    // Asignar una habitación al personal para limpiar
    public void asignarHabitacion(int numeroHabitacion) {
        habitacionesAsignadas.add(numeroHabitacion);
    }
    // Obtener el número de habitaciones que el personal tiene asignadas para limpiar
    public int getNumeroHabitacionesAsignadas() {
        return habitacionesAsignadas.size();
    }
    // Obtener la lista de habitaciones asignadas al personal
    public List<Integer> getHabitacionesAsignadas() {
        return new ArrayList<>(habitacionesAsignadas); // Retorna una copia para evitar modificaciones externas
    }
}
