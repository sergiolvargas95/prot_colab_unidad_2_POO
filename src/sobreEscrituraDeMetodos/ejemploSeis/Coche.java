package sobreEscrituraDeMetodos.ejemploSeis;

public class Coche extends Vehiculo {
    //Se intenta sobre escribir el método heredado de Vehiculo pero no se están solicitando los mismos parametros por lo tanto dará error de complicación.
    @Override
    public void acelerar() {
        System.out.println("El coche acelera.");
    }
}
