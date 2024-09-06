package com.mycompany.hotel;
import java.util.*;
public class GestionH {
    private HabitacionFamiliar familiar = new HabitacionFamiliar();
    private HabitacionSimple simple = new HabitacionSimple() ;
    private Suite suite = new Suite();
    Map<String, Habitaciones> Habitaciones = new HashMap<>();
    Scanner sc= new Scanner(System.in);
    public GestionH(){
        Habitaciones.put("familiar", familiar);
        Habitaciones.put("simple", simple);
        Habitaciones.put("suite", suite);
    }
    public void Reservar(Cliente cliente[], int index){
        String opc;
        int numhabitacion;
        int dias;
        System.out.println("Ingrese el tipo de habitacion que desea ");
        System.out.println(" familiar suite o simple");
        opc=sc.nextLine();
        while(!opc.equals("familiar") && !opc.equals("suite") && !opc.equals("simple")){
            System.out.println("Opcion invalida, vuelva  aintetnar");
            opc=sc.nextLine();
        }
        Habitaciones seleccionada = Habitaciones.get(opc);  //recuperamos el tipo de objeto con el que queremos trabajar
        if(seleccionada.getNhabi()>0){   
            System.out.println("Cuantos dias se hospedara?");
            dias = sc.nextInt();
            while(dias<0){
                System.out.println("Numero invalido de dias ");
                dias = sc.nextInt();
            }
            System.out.println("Ya se le reservo una habitacion");
            numhabitacion = seleccionada.disponibles();
            cliente[index].setDeuda(seleccionada.getPrecio(),dias);
            cliente[index].setNumH(opc, numhabitacion);   
        }else{
            System.out.println("No se pudo reservar una habitacion, todas estan llenas");
        }
    }
    public void Cancelar(Cliente cliente[],  int index){
        String opc;
        int erase;
        System.out.println("Esta seguro que desea cancelar su reservacion?  si/no");
        opc=sc.nextLine();
        while(!opc.equals("si") && !opc.equals("no")){
            System.out.println("opcion incorrecta vuelvalo a intentar ");
            opc=sc.nextLine();
        }
        if(opc.equals("si")){
            String elec;
            System.out.println("que reservacion desea cancelar? ");
            System.out.println(cliente[index].getHabitaciones());
            elec=sc.nextLine();
            while(!cliente[index].getHabitaciones().contains(elec)){
                System.out.println("no se encontro esa reservacion vuelvalo a intentar");
                elec=sc.nextLine();
            }
            Habitaciones selec = Habitaciones.get(elec);
            erase=cliente[index].LiberarH(elec);    //buscamos el indice de la reservacion a eliminar
            selec.liberar(erase);
            System.out.println("Se cancelo con exito la reservacion");
        }
    }
}
