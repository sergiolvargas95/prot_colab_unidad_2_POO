package InterfacesVsAbstractas.ejercicioUno;

import clasesAbstractas.ejercicioUno.Figura;

public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double area;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
    }

    @Override
    public void mostrarArea() {
        System.out.println("El área del rectangulo es " + String.format("%.2f", area));
    }
}