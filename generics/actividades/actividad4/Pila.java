package acti4;
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

    // Método para verificar si una pila es igual a otra
    public boolean esIgual(Pila<E> otraPila) {
        // Comprobar si el tamaño de ambas pilas es el mismo
        if (this.superior != otraPila.superior) {
            return false; // Si los tamaños son diferentes, no son iguales
        }

        // Comparar los elementos de ambas pilas
        for (int i = 0; i <= superior; i++) {
            if (!elementos[i].equals(otraPila.elementos[i])) {
                return false; // Si algún elemento no coincide, las pilas no son iguales
            }
        }

        return true; // Si todos los elementos coinciden, las pilas son iguales
    }

    // Métodos adicionales (como push, pop, etc.) se mantienen aquí...

}

