package acti2;

// Clase Pila genérica que almacena elementos de tipo E
public class Pila<E> {
    private final int tamanio; // número de elementos en la pila
    private int superior; // ubicación del elemento superior
    private E[] elementos; // arreglo que almacena los elementos de la pila

    // Constructor sin argumentos que crea una pila del tamaño predeterminado
    public Pila() {
        this(10); // tamaño predeterminado de la pila
    }

    // Constructor que crea una pila del número especificado de elementos
    public Pila(int s) {
        tamanio = s > 0 ? s : 10; // establece el tamaño de la pila
        superior = -1; // al principio, la pila está vacía
        elementos = (E[]) new Object[tamanio]; // crea el arreglo para almacenar los elementos
    }

    // Método para añadir un elemento a la pila (push)
    public void push(E valorAMeter) {
        if (superior == tamanio - 1) { // si la pila está llena
            throw new ExcepcionPilaLlena(String.format("La Pila está llena, no se puede meter %s", valorAMeter));
        }
        elementos[++superior] = valorAMeter; // mete valorAMeter en la pila
    }

    // Método para sacar el último elemento de la pila (pop)
    public E pop() {
        if (superior == -1) { // si la pila está vacía
            throw new ExcepcionPilaVacia("Pila vacía, no se puede sacar");
        }
        return elementos[superior--]; // elimina y devuelve el último elemento
    }

    // Método para verificar si un elemento está presente en la pila
    public boolean contains(E elemento) {
        for (int i = superior; i >= 0; i--) { // Itera desde el tope hacia el fondo de la pila
            if (elementos[i].equals(elemento)) {
                return true; // Si encuentra el elemento, devuelve true
            }
        }
        return false; // Si no encuentra el elemento, devuelve false
    }
}


