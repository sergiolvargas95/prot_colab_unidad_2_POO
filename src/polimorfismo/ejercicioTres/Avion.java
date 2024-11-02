package polimorfismo.ejercicioTres;

public class Avion extends Transporte {
    public void despegar() {
        System.out.println("El avion esta despegando.");
    }

    //Esto es una mala practica porque agrega complicación al codigo sin necesidad ya que podemos
    //llamar a este metodo diectamente por medio de la herencia, también dificulta el mantenimiento
    // y rompe el proposito de la sobreescritura que solo se debe usar cuando una clase necesita
    //adaptar un comportamiento específico.
    @Override
    public void arrancar() {
         super.arrancar();
    }
}
