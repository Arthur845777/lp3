package ejer4;

import java.util.*;

// Clase genérica Contenedor que almacena múltiples pares de elementos
public class Contenedor<F, S> {
    private List<Par<F, S>> pares; // Lista para almacenar objetos de tipo Par

    // Constructor que inicializa la lista
    public Contenedor() {
        this.pares = new ArrayList<>(); // Inicializa el ArrayList
    }

    // Método para agregar un nuevo par al contenedor
    public void agregarPar(F primero, S segundo) {
        Par<F, S> nuevoPar = new Par<>(primero, segundo); // Crear un nuevo objeto Par
        pares.add(nuevoPar); // Agregar el par a la lista
    }

    // Método para obtener un par en la posición especificada
    public Par<F, S> obtenerPar(int indice) {
        if (indice < 0 || indice >= pares.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango"); // Validar el índice
        }
        return pares.get(indice); // Devolver el par en la posición especificada
    }

    // Método para obtener la lista completa de pares
    public List<Par<F, S>> obtenerTodosLosPares() {
        return pares; // Devolver la lista de pares
    }

    // Método para mostrar todos los pares almacenados en el contenedor
    public void mostrarPares() {
        for (Par<F, S> par : pares) {
            System.out.println(par); // Imprimir cada par utilizando el método toString
        }
    }
}
