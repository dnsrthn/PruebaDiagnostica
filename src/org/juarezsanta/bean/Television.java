package org.juarezsanta.bean;

public abstract class Television extends Dispositivo{
    private String pantalla;

    public Television(String modelo, String marca, int anio) {
        super(modelo, marca, anio);
        
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }
    
}
