package org.juarezsanta.controller;
import org.juarezsanta.bean.Dispositivo;

public abstract class DispositivoController extends Dispositivo{

    public DispositivoController(String marca, String modelo, int anio) {
        super(marca, modelo, anio); 
    }   
    

    public void mostrarInformacion(){
        System.out.println("marca"+ marca);
        System.out.println("modelo"+ modelo  );
        System.out.println("año"+ anio);
    }
    
    public abstract void encender();

    public  void encender(int voltaje){
        System.out.println("el dispositivo prende con este voltaje"+ voltaje + "V");
    }
}


