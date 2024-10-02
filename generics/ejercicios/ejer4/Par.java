package ejer4;

// Clase genérica Par que tiene dos parámetros de tipo: F y S
public class Par<F, S> {
    private F primero; // Primer elemento del par
    private S segundo; // Segundo elemento del par

    // Constructor para inicializar el par con los elementos primero y segundo
    public Par(F primero, S segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    // Método para obtener el primer elemento
    public F getPrimero() {
        return primero;
    }

    // Método para obtener el segundo elemento
    public S getSegundo() {
        return segundo;
    }

    // Método para establecer el primer elemento
    public void setPrimero(F primero) {
        this.primero = primero;
    }

    // Método para establecer el segundo elemento
    public void setSegundo(S segundo) {
        this.segundo = segundo;
    }

    // Método toString para representar el par como una cadena en el formato “(Primero: x, Segundo: y)”
    @Override
    public String toString() {
        return String.format("(Primero: %s, Segundo: %s)", primero, segundo);
    }

    // Método básico esIgual para comparar dos pares
    public boolean esIgual(Par<F, S> otroPar) {
        // Comparar si los elementos primero y segundo son iguales usando equals
        if(primero.equals(otroPar.primero) && segundo.equals(otroPar.segundo)){
            return true;
        }
        return false;
    }
}
