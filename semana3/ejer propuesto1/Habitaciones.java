package com.mycompany.hotel;
public interface Habitaciones {
    int precio=0; 
    static int nHabitaciones=15;
    public abstract void getCaracteristicas();
    public abstract int disponibles();
    public abstract int getNhabi();
    public abstract  void liberar(int n);
    public abstract int getPrecio();
}