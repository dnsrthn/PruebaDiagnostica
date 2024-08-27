package org.juarezsanta.controller;

import org.juarezsanta.bean.Dispositivo;

public abstract class TelefonoController extends Dispositivo {

    private String tipo;

    public TelefonoController(String modelo, String marca, int anio, String tipo) {
        super(modelo, marca, anio);
        this.tipo = tipo;
    }

    
   
    public  void encender(){
        System.out.println("Telefono encendido...");
    }

    public void encender(String codigo){
        System.out.println("telefono encendido con codigo" + codigo);
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("tipo"+ tipo);

    }
}



