package InterfacesVsAbstractas.ejercicioUno;

public abstract class Figura {
    protected double area;

    //Metodo abstracto
    public abstract void calcularArea();


    public void mostrarArea() {
        System.out.println("El area es: " + area);
    }
}
