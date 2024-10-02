package ejer4;

public class Prueba {
        public static void main(String[] args) {
            // Crear una instancia del Contenedor para pares de tipo String e Integer
            Contenedor<String, Integer> contenedor = new Contenedor<>();
    
            // Agregar pares al contenedor
            contenedor.agregarPar("Edad", 25);
            contenedor.agregarPar("Estatura", 175);
            contenedor.agregarPar("Peso", 70);
    
            // Mostrar todos los pares almacenados
            System.out.println("Pares almacenados en el contenedor:");
            contenedor.mostrarPares(); // Imprime todos los pares
    
            // Obtener un par específico
            Par<String, Integer> parObtenido = contenedor.obtenerPar(1); // Obtener el segundo par
            System.out.println("Par obtenido en el índice 1: " + parObtenido);
        }
    
}
