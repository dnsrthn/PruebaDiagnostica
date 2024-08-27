package org.juarezsanta.system.Controller;

import java.util.ArrayList;
import java.util.List;

import org.juarezsanta.system.Bean.Circulo;
import org.juarezsanta.system.Bean.Forma;
import org.juarezsanta.system.Bean.Rectangulo;
import org.juarezsanta.system.Bean.Triangulo;

public class ControllerForma {
    private List<Forma> formas;

    public ControllerForma() {
        this.formas = new ArrayList<>();
    }

    // Método para agregar una forma a la lista
    public void agregarForma(Forma forma) {
        formas.add(forma);
    }

    // Método para calcular y mostrar el área de todas las formas
    public void calcularAreas() {
        for (Forma forma : formas) {
            forma.mostrarInformacion();
        }
    }

    public static void main(String[] args) {
        ControllerForma controlador = new ControllerForma();

        // Crear instancias de formas
        Forma circulo = new Circulo("Rojo", "Un círculo rojo", 5.0);
        Forma rectangulo = new Rectangulo("Azul", "Un rectángulo azul", 4.0, 6.0);
        Forma triangulo = new Triangulo("Verde", "Un triángulo verde", 5.0, 7.0);

        // Agregar formas al controlador
        controlador.agregarForma(circulo);
        controlador.agregarForma(rectangulo);
        controlador.agregarForma(triangulo);

        // Calcular y mostrar el área de todas las formas
        controlador.calcularAreas();
    }
}

