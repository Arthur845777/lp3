package inventario;

public class item {
    private String name;
    private int cantidad;
    private String tipo;
    private String descripcion;

    public item(){}
    public item(String name, int cantidad, String tipo, String descripcion){
        this.name=name;
        this.cantidad=cantidad;
        this.tipo=tipo;
        this.descripcion=descripcion;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.cantidad = Cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método adicional
    public void usaritem() {
        if (tipo.equals("arma")) {
            System.out.println("Se realizó un ataque");
        } else if (cantidad <= 0) {
            System.out.println("No cuenta con suficientes reservas");
        } else {
            cantidad--;
            System.out.println("Item usado");
        }
    }

    @Override
    public String toString() {
        return String.format("nombre = \s\n" +"tipo = \s\n" +"cantidad = \s\n" +"descripcion = \s\n", name, tipo, cantidad, descripcion);
    }

}
