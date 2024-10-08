package inventario;

// Clase hija Arma
public class Arma extends Item {
    private double damage;

    public Arma(String name, int cantidad, String tipo, String descripcion, double damage) {
        super(name, cantidad, tipo, descripcion);
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return super.toString() + "daño = " + damage + "\n";
    }
}
