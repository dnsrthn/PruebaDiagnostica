import org.juarezsanta.system.Bean.Rectangulo;

public class ControllerRectangulo {
    private Rectangulo rectangulo;

    public ControllerRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
    }

    public void mostrarInformacion() {
        rectangulo.mostrarInformacion();
    }

    public void calcularArea() {
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo("Azul", "Un rectángulo azul", 4.0, 6.0);
        ControllerRectangulo controlador = new ControllerRectangulo(rectangulo);
        controlador.mostrarInformacion();
        controlador.calcularArea();
    }
}
