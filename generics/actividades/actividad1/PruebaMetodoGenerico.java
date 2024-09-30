package acti1;

public class PruebaMetodoGenerico {

    // Método genérico para imprimir todo el arreglo
    public static <E> void imprimirArreglo(E[] arregloEntrada) {
        for (E elemento : arregloEntrada) { // Itera sobre cada elemento del arreglo
            System.out.printf("%s ", elemento); // Imprime cada elemento seguido de un espacio
        }
        System.out.println(); // Salto de línea después de imprimir todos los elementos
    }

    // Método sobrecargado para imprimir una parte del arreglo
    public static <E> int imprimirArreglo(E[] arregloEntrada, int subindiceInferior, int subindiceSuperior) {
        // Validación de los índices
        if (subindiceInferior < 0 || subindiceSuperior >= arregloEntrada.length || subindiceInferior >= subindiceSuperior) {
            throw new InvalidSubscriptException("Índices fuera de rango o inválidos."); // Lanza excepción si los índices no son válidos
        }

        // Imprime los elementos dentro del rango especificado
        for (int i = subindiceInferior; i <= subindiceSuperior; i++) {
            System.out.printf("%s ", arregloEntrada[i]);
        }
        System.out.println(); // Salto de línea después de imprimir los elementos

        return subindiceSuperior - subindiceInferior + 1; // Devuelve la cantidad de elementos impresos
    }

    // Método principal para probar ambas versiones del método imprimirArreglo
    public static void main(String[] args) {
        // Crear arreglos de objetos Integer, Double y Character
        Integer[] arregloInteger = {1, 2, 3, 4, 5, 6};
        Double[] arregloDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] arregloCharacter = {'H', 'O', 'L', 'A'};

        // Imprimir todos los elementos del arreglo
        System.out.println("El arreglo arregloInteger contiene:");
        imprimirArreglo(arregloInteger); // Llama al método genérico para imprimir todo el arreglo Integer

        System.out.println("\nEl arreglo arregloDouble contiene:");
        imprimirArreglo(arregloDouble); // Llama al método genérico para imprimir todo el arreglo Double

        System.out.println("\nEl arreglo arregloCharacter contiene:");
        imprimirArreglo(arregloCharacter); // Llama al método genérico para imprimir todo el arreglo Character

        // Imprimir una parte del arreglo utilizando la sobrecarga
        System.out.println("\nImprimiendo parte del arregloInteger (índices 1 a 4):");
        try {
            int elementosImpresos = imprimirArreglo(arregloInteger, 1, 4); // Imprimir los elementos desde el índice 1 al 4
            System.out.println("Cantidad de elementos impresos: " + elementosImpresos);
        } catch (InvalidSubscriptException e) {
            System.out.println(e.getMessage()); // Captura y muestra el mensaje de la excepción
        }
    }   
}



