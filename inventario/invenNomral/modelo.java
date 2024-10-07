package inventario;
import java.util.*;
public class modelo {
    private List<item> items;
    public modelo(){
        items= new ArrayList<>();

    }

    public void AgregarItem(item ite){
        items.add(ite);
    }

    public List<item> getItems(){
        return items;
    }

    public boolean EliminarItem(String temp){
        int index=0;
        for(item i: items){
            System.out.println(i);
            if (temp.equals(i.getName())){
                items.remove(index);
                return true;
            }
            index++;
        }  
        return false;
    }

    public item obtenerItem(String nombre) {
        int index = 0;
        for (item i : items) {
            if (nombre.equals(i.getName())) {
                return items.get(index);
            }
            index++;
        }
        // Si no se encuentra el item, devuelve null o lanza una excepción.
        return null;
    }
    
}
