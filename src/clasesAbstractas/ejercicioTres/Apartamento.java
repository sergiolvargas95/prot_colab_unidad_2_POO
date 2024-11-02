package clasesAbstractas.ejercicioTres;

public class Apartamento extends Vivienda {
//Requiere implementar el método abstracto

    @Override
    public void calcularArriendo() {
        double total = numeroHabitaciones + valorServicios;
    }
}