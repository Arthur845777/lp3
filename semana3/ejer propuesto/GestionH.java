// En esta clase se gestiona la relación entre los tipos de habitaciones y sus instancias
package com.mycompany.hotel;
import java.util.*;

public class GestionH {
    private HabitacionFamiliar familiar = new HabitacionFamiliar();
    private HabitacionSimple simple = new HabitacionSimple();
    private Suite suite = new Suite();
    
    // Se utiliza un Map para evitar if o switch, permitiendo la selección directa de la habitación
    Map<String, Habitaciones> Habitaciones = new HashMap<>();
    Scanner sc= new Scanner(System.in);

    public GestionH(){
        // Mapeamos los nombres de tipos de habitaciones con sus respectivas clases
        Habitaciones.put("familiar", familiar);
        Habitaciones.put("simple", simple);
        Habitaciones.put("suite", suite);
    }

    public void Reservar(Cliente cliente[], int index){
        String opc;
        int numhabitacion;
        int dias;
        
        // Preguntamos por el tipo de habitación deseada
        System.out.println("Ingrese el tipo de habitacion que desea ");
        System.out.println(" familiar suite o simple");
        opc=sc.nextLine();
        
        // Validamos que la entrada sea válida, usando directamente el Map en lugar de if/switch
        while(!Habitaciones.containsKey(opc)){
            System.out.println("Opcion invalida, vuelva a intentar");
            opc=sc.nextLine();
        }
        
        // Recuperamos el tipo de habitación usando el Map
        Habitaciones seleccionada = Habitaciones.get(opc);  
        
        if(seleccionada.getNhabi() > 0){  // Verificamos si hay habitaciones disponibles
            System.out.println("Cuantos dias se hospedara?");
            dias = sc.nextInt();
            
            while(dias < 0){
                System.out.println("Numero invalido de dias ");
                dias = sc.nextInt();
            }
            
            System.out.println("Ya se le reservo una habitacion");
            numhabitacion = seleccionada.disponibles();  // Asignamos habitación disponible
            cliente[index].setDeuda(seleccionada.getPrecio(), dias);  // Calculamos la deuda
            cliente[index].setNumH(opc, numhabitacion);  // Asignamos la habitación al cliente   
        } else {
            System.out.println("No se pudo reservar una habitacion, todas estan llenas");
        }
    }

    public void Cancelar(Cliente cliente[], int index){
        String opc;
        int erase;
        
        System.out.println("Esta seguro que desea cancelar su reservacion?  si/no");
        opc = sc.nextLine();
        
        while(!opc.equals("si") && !opc.equals("no")){
            System.out.println("Opcion incorrecta, vuelva a intentar");
            opc = sc.nextLine();
        }
        
        if(opc.equals("si")){
            String elec;
            System.out.println("¿Qué reservación desea cancelar?");
            System.out.println(cliente[index].getHabitaciones());  // Mostramos las habitaciones reservadas
            elec = sc.nextLine();
            
            // Validamos que la habitación exista en la lista de reservaciones del cliente
            while(!cliente[index].getHabitaciones().contains(elec)){
                System.out.println("No se encontró esa reservacion, vuelva a intentar");
                elec = sc.nextLine();
            }
            
            // Recuperamos el tipo de habitación y liberamos la reservación
            Habitaciones selec = Habitaciones.get(elec);  
            erase = cliente[index].LiberarH(elec);  // Eliminamos la reservación
            selec.liberar(erase);  // Liberamos la habitación
            System.out.println("Se cancelo con éxito la reservacion");
        }
    }
}
