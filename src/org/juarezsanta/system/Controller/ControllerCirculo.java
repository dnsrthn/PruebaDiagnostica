import org.juarezsanta.system.Bean.Circulo;

public class ControllerCirculo {
    private Circulo circulo;

    public ControllerCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

    public void mostrarInformacion() {
        circulo.mostrarInformacion();
    }

    public void calcularArea() {
        System.out.println("Área del círculo: " + circulo.calcularArea());
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", "Un círculo rojo", 5.0);
        ControllerCirculo controlador = new ControllerCirculo(circulo);
        controlador.mostrarInformacion();
        controlador.calcularArea();
    }
}
