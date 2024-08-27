import org.juarezsanta.system.Bean.Triangulo;

public class ControllerTriangulo {
    private Triangulo triangulo;

    public ControllerTriangulo(Triangulo triangulo) {
        this.triangulo = triangulo;
    }

    public void mostrarInformacion() {
        triangulo.mostrarInformacion();
    }

    public void calcularArea() {
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo("Verde", "Un triángulo verde", 5.0, 7.0);
        ControllerTriangulo controlador = new ControllerTriangulo(triangulo);
        controlador.mostrarInformacion();
        controlador.calcularArea();
    }
}
