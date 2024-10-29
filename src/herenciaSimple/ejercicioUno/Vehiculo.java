package herenciaSimple.ejercicioUno;

public class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

    /*
     * CONSTRUCTORES
     */
    public Vehiculo() {}

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    /*
     * MÉTODOS GETTERS Y SETTERS
     */

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

}
