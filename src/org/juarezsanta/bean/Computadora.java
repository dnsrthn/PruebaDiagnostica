package org.juarezsanta.bean;

public abstract class Computadora extends Dispositivo{
    private String sitemaOperativo;

    public Computadora(String modelo, String marca, int anio) {
        super(modelo, marca, anio);
       
    }

    public String getSitemaOperativo() {
        return sitemaOperativo;
    }

    public void setSitemaOperativo(String sitemaOperativo) {
        this.sitemaOperativo = sitemaOperativo;
    }
    
    
}
