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
    public void encender() {
        System.out.println("Telefono encendido.");
    }

    // Método sobrecargado (polimorfismo estático)
    public void encender(String codigo) {
        System.out.println("Telefono encendido con código: " + codigo);
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
    }
}
