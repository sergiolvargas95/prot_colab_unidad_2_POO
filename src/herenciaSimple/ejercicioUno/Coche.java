package herenciaSimple.ejercicioUno;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    /*
     * CONSTRUCTORES
     */

    public Coche() {}

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    /*
     * METODOS GETTERS Y SETTERS
     */
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

}

