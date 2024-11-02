package clasesAbstractas.ejercicioUno;

public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5);

        rectangulo.calcularArea();
        rectangulo.mostrarArea();

        Figura circulo = new Circulo(7);

        circulo.calcularArea();
        circulo.mostrarArea();
    }
}
