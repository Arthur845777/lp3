// Interfaz que define los métodos para gestionar habitaciones
package com.mycompany.hotel;
public interface Habitaciones {
    int precio=0;  // Precio de la habitación
    static int nHabitaciones=15;  // Número total de habitaciones (estático)
    
    public abstract void getCaracteristicas();  // Método para obtener las características de la habitación
    public abstract int disponibles();  // Método para obtener la disponibilidad
    public abstract int getNhabi();  // Obtener el número de habitaciones disponibles
    public abstract void liberar(int n);  // Liberar una habitación específica
    public abstract int getPrecio();  // Obtener el precio de la habitación
}
