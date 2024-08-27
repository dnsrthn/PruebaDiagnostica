package org.juarezsanta.system.Bean;

public class Cuadrado extends Forma {
    private double base;
    private double altura;

    public Cuadrado(String color, String mensaje, double base, double altura) {
        super(color, mensaje);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return Math.pow(altura, base);
    }
}
