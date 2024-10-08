package inventario;

public class Jugador extends NPC {
    private int experiencia;  // Atributo de experiencia
    private int expT = 500;

    // Constructor
    public Jugador(String name, double salud, int nivel, int experiencia) {
        super(name, salud, nivel);  // Llama al constructor de NPC
        this.experiencia = experiencia;
    }

    // Getter y setter para experiencia
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    // Implementación del método atacar (si quieres modificar el comportamiento en Jugador)
    @Override
    public double atacar() {
        return arma.getDamage() + (experiencia * 0.1);  // El daño aumenta según la experiencia
    }

    // Implementación del método recibirDaño
    @Override
    public void recibirDaño(NPC enemigo) {
        salud = salud - enemigo.atacar();
    }

    public boolean SubirNivel(){
        if(experiencia>expT){
            nivel++;
            experiencia-=expT;
            expT*=1.2;
            return true;
        }else{
            return false;
        }
    }

    // Método para aumentar la experiencia
    public void ganarExperiencia(int exp) {
        this.experiencia += exp;
    }
}
