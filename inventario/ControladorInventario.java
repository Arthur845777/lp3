package inventario;

import java.util.List;

public class ControladorInventario {
    private InventarioModelo mod;
    private VistaInventario view;

    public ControladorInventario(InventarioModelo mod, VistaInventario view){
        this.mod=mod;
        this.view=view;
    }

    public void AgregarItem(Item it){
        if(it == null){
            view.MostrarMensaje("La informacion del item no es correcta");
        }else{
            mod.AgregarItem(it);
        }
    }
    
    public void EliminarItem(){
        String objeto;
        objeto=view.Buscar();
        if(mod.EliminarItem(objeto)){
            view.MostrarMensaje("Se elimino con exito ");
        }else{
            view.MostrarMensaje("Mo se pudo borrar el item");
        }
    }

    public void VerInventario(){
        List<Item> items = mod.getItems();
        view.Mostrarinventario(items);
    }

    public void MostrarDe(){
        view.MostrarDetalles(mod.getItems());
    }

    public Item BuscarItem(){
        String tempM;
        Item tempI;
        view.MostrarMensaje("Que esta buscando?");
        tempM=view.Buscar();
        try{
            tempI=mod.obtenerItem(tempM);
            if(tempI==null){
                throw new NoencontradoException("El item no esta en su inventario ");
            }else{
                return tempI;
            }  
        }catch(NoencontradoException e){
            System.out.println(e);
            return null;
        }
        
    }

    public void UsarItem(Item It){
        if(mod.usaritem(It)){
            view.MostrarMensaje("El item fue usado");
        }else{
            view.MostrarMensaje("no se pudousar el item");
        }
        
    }

}
