package polimorfismo.ejercicioUno;

public class Rectangulo extends Figura {
    private double lado;

    public Rectangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        area = lado * lado;
    }

    @Override
    public void mostrarArea() {
        System.out.println("El área del rectangulo es " + String.format("%.2f", area));
    }
}

