package org.juarezsanta.system.Bean;

public class Circulo extends Forma {
    private double radio;

    public Circulo(String color, String mensaje, double radio) {
        super(color, mensaje);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
