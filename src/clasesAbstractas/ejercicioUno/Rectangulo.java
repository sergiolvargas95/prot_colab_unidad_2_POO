package clasesAbstractas.ejercicioUno;

public class Rectangulo extends Figura {
    private double lado;

    public Rectangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        area = lado * lado;
    }
}
