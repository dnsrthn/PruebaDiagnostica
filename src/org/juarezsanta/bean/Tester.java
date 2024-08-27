package org.juarezsanta.bean;

public class Tester extends Empleado {
    private String tipoPruebas;

    public Tester(String nombre, int edad, double salario, String tipoPruebas) {
        super(nombre, edad, salario);
        this.tipoPruebas = tipoPruebas;
    }

    @Override
    public void trabajar() {
        System.out.println("el tester " + nombre + " está realizando pruebas de tipo " + tipoPruebas);
    }

    public void trabajar(String herramienta, String proyecto) {
        System.out.println("el tester " + nombre + " está usando " + herramienta + " en el proyecto: " + proyecto);
    }

    public String getTipoPruebas() {
        return tipoPruebas;
    }

    public void setTipoPruebas(String tipoPruebas) {
        this.tipoPruebas = tipoPruebas;
    }
}