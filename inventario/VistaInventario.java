package inventario;
import java.util.*;

public class VistaInventario {
    private Scanner sc;
    public VistaInventario(){
        sc =new Scanner(System.in);
    }

    public void Mostrarinventario(List<Item>it){
        for(Item i :it){
            System.out.println(i.getName());
        }
    }
    
    public String Buscar(){
        return sc.nextLine();
    }

    public void MostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void MostrarDetalles(List<Item>it){
        for(Item i :it){
            System.out.println(i);
        }
    }
}
