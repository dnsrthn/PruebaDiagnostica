/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.juarezsanta.system;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("elige una opción:");
            System.out.println("1. ejercicio 1: clases empleado, desarrollador, tester");
            System.out.println("2. ejercicio 2: clases forma, círculo, triángulo, cuadrado, rectángulo");
            System.out.println("3. ejercicio 3: clases dispositivo, teléfono, computadora, televisor");
            System.out.println("4. salir");
            System.out.print("opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejecutarEjercicio1();
                    break;
                case 2:
                    ejecutarEjercicio2();
                    break;
                case 3:
                    ejecutarEjercicio3();
                    break;
                case 4:
                    System.out.println("saliendo del programa...");
                    break;
                default:
                    System.out.println("opción no válida. por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void ejecutarEjercicio1() {
        // código del ejercicio 1
        // crear instancias de desarrollador y tester
        Desarrollador desarrollador = new Desarrollador("jose", 30, 50000, "java");
        Tester tester = new Tester("maria", 28, 45000, "pruebas automáticas");

        // mostrar detalles de desarrollador
        System.out.println("\n** desarrollador **");
        desarrollador.trabajar();
        desarrollador.trabajar(8);
        desarrollador.trabajar("proyecto A");

        // mostrar detalles de tester
        System.out.println("\n** tester **");
        tester.trabajar();
        tester.trabajar(6);
        tester.trabajar("selenium", "proyecto B");
    }

    private static void ejecutarEjercicio2() {
        // código del ejercicio 2
        // crear instancias de círculo, triángulo, cuadrado, y rectángulo
        Circulo circulo = new Circulo("rojo", 5);
        Triangulo triangulo = new Triangulo("azul", 4, 7);
        Cuadrado cuadrado = new Cuadrado("verde", 3);
        Rectangulo rectangulo = new Rectangulo("amarillo", 6, 8);

        // mostrar detalles de cada forma
        System.out.println("\n** círculo **");
        circulo.calcularArea();
        circulo.calcularArea(2.0);

        System.out.println("\n** triángulo **");
        triangulo.calcularArea();
        triangulo.calcularArea(1.5);

        System.out.println("\n** cuadrado **");
        cuadrado.calcularArea();
        cuadrado.calcularArea(3.0);

        System.out.println("\n** rectángulo **");
        rectangulo.calcularArea();
        rectangulo.calcularArea(4.0);
    }

    private static void ejecutarEjercicio3() {
        // código del ejercicio 3
        // crear instancias de teléfono, computadora, y televisor
        Telefono telefono = new Telefono("samsung", "galaxy s21", 2021, "smartphone");
        Computadora computadora = new Computadora("apple", "macbook pro", 2020, "macos");
        Televisor televisor = new Televisor("lg", "oled55", 2022, 55);

        // mostrar detalles de cada dispositivo
        System.out.println("\n** teléfono **");
        telefono.mostrarInformacion();
        telefono.encender();
        telefono.encender(5);
        telefono.encender("1234");

        System.out.println("\n** computadora **");
        computadora.mostrarInformacion();
        computadora.encender();
        computadora.encender(220);
        computadora.encender("clave123");

        System.out.println("\n** televisor **");
        televisor.mostrarInformacion();
        televisor.encender();
        televisor.encender(100);
    }
}
