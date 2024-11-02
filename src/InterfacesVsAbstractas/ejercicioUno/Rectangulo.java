package InterfacesVsAbstractas.ejercicioUno;

import clasesAbstractas.ejercicioUno.Figura;

public class Rectangulo extends Figura {
    private double lado;
    private double area;

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