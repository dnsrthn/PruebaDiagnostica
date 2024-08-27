package org.juarezsanta.bean;

public abstract class Telefono extends Dispositivo{
    private String tipo;
    
    public Telefono(String modelo, String marca, int anio) {
        super(modelo, marca, anio);
        
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
