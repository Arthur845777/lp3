package inventario;

import java.util.List;

public class controlador {
    private modelo mod;
    private vista view;

    public controlador(modelo mod, vista view){
        this.mod=mod;
        this.view=view;
    }
    public void AgregarItem(item it){
        if(it == null){
            view.MostrarMensaje("La informacion del item no es correcta");
        }else{
            mod.AgregarItem(it);
        }
    }
    
    public void EliminarItem(){
        String objeto;
        view.Mostrarinventario(mod.getItems());
        view.MostrarMensaje("Que item eliminara? ");
        objeto=view.Buscar();
        if(mod.EliminarItem(objeto)){
            view.MostrarMensaje("Se elimino con exito ");
        }else{
            view.MostrarMensaje("Mo se pudo borrar el item");
        }
    }

    public void VerInventario(){
        List<item> items = mod.getItems();
        view.Mostrarinventario(items);
    }

    public void MostrarDe(){
        view.MostrarDetalles(mod.getItems());
    }

    public item BuscarItem(){
        String tempM;
        item tempI;
        view.Mostrarinventario(mod.getItems());
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
}
