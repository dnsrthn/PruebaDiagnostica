package org.juarezsanta.controller;

import org.juarezsanta.bean.Empleado;
import org.juarezsanta.views.EmpleadosVista;

public class EmpleadoControlador {
    private Empleado model;
    private EmpleadosVista vista;

    public EmpleadoControlador(Empleado modelo, EmpleadosVista vista) {
        this.model = modelo;
        this.vista = vista;
    }

    public void actualizarVista() {
        vista.mostrarDetallesEmpleado(model.getNombre(), model.getEdad(), model.getSalario());
    }

    public void setNombre(String nombre) {
        model.setNombre(nombre);
    }

    public String getNombre() {
        return model.getNombre();
    }

    public void setEdad(int edad) {
        model.setEdad(edad);
    }

    public int getEdad() {
        return model.getEdad();
    }

    public void setSalario(double salario) {
        model.setSalario(salario);
    }

    public double getSalario() {
        return model.getSalario();
    }
}