package herenciaSimple.ejercicioUno;

public class Main {
    public static void main(String[] args) {
        Coche miCarro = new Coche("McLaren P1", 350, 2);

        System.out.println("La marca de mi carro es " + miCarro.getMarca() + "\n" +
                "La velocidad Maxima que alcance es de " + miCarro.getVelocidadMaxima() + " Km/h \n" +
                "El " + miCarro.getMarca() + " tiene un total de " + miCarro.getNumeroDePuertas() + " Puertas");
    }
}
