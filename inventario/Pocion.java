package inventario;

// Clase hija Pocion
public class Pocion extends Item {
    private double duracion;

    public Pocion(String name, int cantidad, String tipo, String descripcion, double duracion) {
        super(name, cantidad, tipo, descripcion);
        this.duracion = duracion;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return super.toString() + "duración = " + duracion + "\n";
    }
}
