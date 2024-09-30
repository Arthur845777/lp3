package acti1;
  // Clase para manejar la excepción de índices inválidos heredando de IndexOutOfBoundsException
  class InvalidSubscriptException extends IndexOutOfBoundsException {
    public InvalidSubscriptException(String mensaje) {
        super(mensaje);
    }
}
