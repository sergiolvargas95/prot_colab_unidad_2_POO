package InterfacesVsAbstractas.ejercicioUno;


public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5);

        rectangulo.calcularArea();
        rectangulo.mostrarArea();

        Triangulo triangulo = new Triangulo(7, 10);

        triangulo.calcularArea();
        triangulo.mostrarArea();
    }
}
