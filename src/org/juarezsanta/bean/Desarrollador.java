package org.juarezsanta.bean;

public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;

    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public void trabajar() {
        System.out.println("el desarrollador " + nombre + " está escribiendo código en " + lenguajeProgramacion);
    }

    public void trabajar(String proyecto) {
        System.out.println("el desarrollador " + nombre + " está trabajando en el proyecto: " + proyecto);
    }
    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
}