package inventario;
import java.util.*;

public class vista {
    private Scanner sc;
    public vista(){
        sc =new Scanner(System.in);
    }

    public void Mostrarinventario(List<item>it){
        for(item i :it){
            System.out.println(i.getName());
        }
    }
    
    public String Buscar(){
        return sc.nextLine();
    }

    public void MostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void MostrarDetalles(List<item>it){
        for(item i :it){
            System.out.println(i);
        }
    }
}
