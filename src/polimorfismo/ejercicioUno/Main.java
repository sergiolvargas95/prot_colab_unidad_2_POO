package polimorfismo.ejercicioUno;

import clasesAbstractas.ejercicioUno.Circulo;
import clasesAbstractas.ejercicioUno.Figura;
import clasesAbstractas.ejercicioUno.Rectangulo;

public class Main {
    public static void main(String[] args) {
        clasesAbstractas.ejercicioUno.Figura rectangulo = new Rectangulo(5);

        rectangulo.calcularArea();
        rectangulo.mostrarArea();

        Figura circulo = new Circulo(7);

        circulo.calcularArea();
        circulo.mostrarArea();
    }
}
