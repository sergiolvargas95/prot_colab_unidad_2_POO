package polimorfismo.ejercicioTres;

public class Main {
    public static void main(String[] args) {
        Transporte avion = new Avion();

        //El metodo no se encuentra en la clase Transporte
        avion.despegar();
    }
}
