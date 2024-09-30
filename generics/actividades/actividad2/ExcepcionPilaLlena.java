package acti2;

// Excepción personalizada para indicar que la pila está llena
class ExcepcionPilaLlena extends IndexOutOfBoundsException   {
    public ExcepcionPilaLlena(String mensaje) {
        super(mensaje);
    }
}

