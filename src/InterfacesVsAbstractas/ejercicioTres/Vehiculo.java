package InterfacesVsAbstractas.ejercicioTres;

public abstract class Vehiculo {
    public default void iniciar() {
        System.out.println("Arrancar el vehiculo");
    }
}
