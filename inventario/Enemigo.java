package inventario;

public class Enemigo extends NPC {
    private String tipo;  // Atributo tipo para el enemigo

    // Constructor
    public Enemigo(String name, double salud, int nivel, String tipo) {
        super(name, salud, nivel);  // Llama al constructor de NPC
        this.tipo = tipo;
    }

    // Getter y setter para tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Implementación del método atacar
    @Override
    public double atacar() {
        return arma.getDamage() + (nivel * 0.2);  // Daño incrementado según el nivel del enemigo
    }

    public Arma drop(){
        return arma;
    }

    public int death(){
        return 100*nivel;
    }

    // Implementación del método recibirDaño
    @Override
    public void recibirDaño(NPC enemigo) {
        salud = salud - enemigo.atacar();
    }
}
