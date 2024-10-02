package ejer2;

public class PruebaPar {
    public static void main(String[] args) {
        // Crear instancias de Par con tipos Integer y String
        Par<Integer, String> par1 = new Par<>(1, "Hola");
        Par<Integer, String> par2 = new Par<>(1, "Hola");
        Par<Integer, String> par3 = new Par<>(2, "Mundo");
        Par<Integer, String> par4 = new Par<>(null, "Hola");

        // Pruebas del método esIgual
        System.out.println("Comparando par1 y par2 (iguales): " + par1.esIgual(par2)); // true
        System.out.println("Comparando par1 y par3 (diferentes): " + par1.esIgual(par3)); // false
        System.out.println("Comparando par1 y par4 (diferentes): " + par1.esIgual(par4)); // false
        System.out.println("Comparando par4 y par4 (iguales): " + par4.esIgual(par4)); // true

        // Crear instancias de Par con tipos Double y Boolean
        Par<Double, Boolean> par5 = new Par<>(3.14, true);
        Par<Double, Boolean> par6 = new Par<>(3.14, true);
        Par<Double, Boolean> par7 = new Par<>(2.71, false);

        // Pruebas adicionales del método esIgual
        System.out.println("Comparando par5 y par6 (iguales): " + par5.esIgual(par6)); // true
        System.out.println("Comparando par5 y par7 (diferentes): " + par5.esIgual(par7)); // false
    }
}
