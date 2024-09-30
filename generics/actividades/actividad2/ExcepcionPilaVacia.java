package acti2;

// Excepción personalizada para indicar que la pila está vacía
class ExcepcionPilaVacia extends IndexOutOfBoundsException {
    public ExcepcionPilaVacia(String mensaje) {
        super(mensaje);
    }
}

