package inventario;

public class NPC {
    protected String name;
    protected double salud;
    protected int nivel;
    protected Arma arma;  // Agregado el atributo arma

    // Constructor
    public NPC(String name, double salud, int nivel) {
        this.name = name;
        this.salud = salud;
        this.nivel = nivel;
    }

    // Métodos de acceso (getters y setters)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {   // Getter para el atributo arma
        return arma;
    }

    public void setArma(Arma arma) {   // Setter para el atributo arma
        this.arma = arma;
    }

    public double atacar() {
        return arma.getDamage();
    }
    public void recibirDaño(NPC enemy){
        salud= salud - enemy.atacar();
    }
}
