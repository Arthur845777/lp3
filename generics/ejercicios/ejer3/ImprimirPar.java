package ejer3;

public class ImprimirPar {
    
    // Método genérico estático para imprimir un Par
    public static <F, S> void imprimirPar(Par<F, S> par) {
        System.out.println(par); // Imprime el objeto Par utilizando el método toString
    }

    public static void main(String[] args) {
        // Crear pares de diferentes tipos
        Par<String, Integer> par1 = new Par<>("Edad", 25);
        Par<Double, Boolean> par2 = new Par<>(3.14, true);
        Par<Persona, Integer> par3 = new Par<>(new Persona("Juan"), 30);
        
        // Llamar al método imprimirPar con los pares creados
        imprimirPar(par1); // Imprime: (Primero: Edad, Segundo: 25)
        imprimirPar(par2); // Imprime: (Primero: 3.14, Segundo: true)
        imprimirPar(par3); // Imprime: (Primero: Juan, Segundo: 30)
    }
}
