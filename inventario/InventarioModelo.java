package inventario;
import java.util.*;
public class InventarioModelo {
    private List<Item> items;

    public InventarioModelo(){
        items= new ArrayList<>();

    }

    public void AgregarItem(Item ite){
        for(Item i: items){
            if(i.getName().equals(ite.getName())){
                i.setCantidad(i.getCantidad()+1);
            }else{
                items.add(ite);
            }
        }
        
    }

    public List<Item> getItems(){
        return items;
    }

    public boolean EliminarItem(String temp) {
        Iterator<Item> iterator = items.iterator();

        while (iterator.hasNext()) {
            Item i = iterator.next();
            
            if (temp.equals(i.getName())) {
                i.setCantidad(i.getCantidad() - 1);
                
                if (i.getCantidad() == 0) {
                    iterator.remove(); // Elimina el elemento de forma segura
                }
                
                return true; // Encontraste el ítem y lo modificaste, puedes salir del método
            }
        }
        
        return false; // No encontraste el ítem
    }
    

    public boolean usaritem(Item it) {
        if (it instanceof Arma) { 
            return false;
        } else if (it.getCantidad() <= 0) {
            return false;
        } else {
            it.setCantidad(it.getCantidad()-1);
            return true;
        }
    }

    public Item obtenerItem(String nombre) {
        int index = 0;
        for (Item i : items) {
            if (nombre.equals(i.getName())) {
                return items.get(index);
            }
            index++;
        }
        // Si no se encuentra el item, devuelve null o lanza una excepción.
        return null;
    }
    
}
