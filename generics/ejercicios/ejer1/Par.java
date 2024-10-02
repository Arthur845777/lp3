package ejer1;

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

    // Método principal para probar la clase Par
    public static void main(String[] args) {
        // Crear una instancia de Par con tipos Integer y String
        Par<Integer, String> par1 = new Par<>(1, "Hola");
        System.out.println(par1); // Imprime (Primero: 1, Segundo: Hola)

        // Modificar los valores del par
        par1.setPrimero(2);
        par1.setSegundo("Mundo");
        System.out.println(par1); // Imprime (Primero: 2, Segundo: Mundo)

        // Crear una instancia de Par con tipos Double y Boolean
        Par<Double, Boolean> par2 = new Par<>(3.14, true);
        System.out.println(par2); // Imprime (Primero: 3.14, Segundo: true)
    }
}
