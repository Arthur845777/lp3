package acti3;

// Clase genérica IgualGenerico
public class IgualGenerico {

    public static <T> boolean esIgualA(T obj1, T obj2) {
        if (obj1 == null) { // Verifica si obj1 es null
            return obj2 == null; // Devuelve true si obj2 también es null, de lo contrario false
        } else {
            return obj1.equals(obj2); // Si obj1 no es null, compara con obj2
        }
    }
    
    // Método principal para probar el método esIgualA
    public static void main(String[] args) {
        // Pruebas con tipos integrados
        Integer num1 = 5;
        Integer num2 = 5;
        String str1 = "Hola";
        String str2 = "Hola";
        Object obj1 = new Object();
        Object obj2 = obj1; // Misma referencia
        Object obj3 = new Object();

        // Comparación entre números
        System.out.println("Comparando dos Integer iguales: " + esIgualA(num1, num2)); // true
        // Comparación entre cadenas de texto
        System.out.println("Comparando dos String iguales: " + esIgualA(str1, str2)); // true
        // Comparación entre dos objetos que son la misma referencia
        System.out.println("Comparando dos Object iguales (misma referencia): " + esIgualA(obj1, obj2)); // true
        // Comparación entre dos objetos diferentes
        System.out.println("Comparando dos Object diferentes: " + esIgualA(obj1, obj3)); // false
        // Comparación con null
        System.out.println("Comparando null con null: " + esIgualA(null, null)); // true
        System.out.println("Comparando null con un Integer: " + esIgualA(null, num1)); // false
    }
}

