package herenciaSimple.ejemploSeis.ejemploCinco;

public class MainEjemploCinco 
{
    public static void main(String[] args) 
    {
        Animal animal = new Animal("Mamifero");
        animal.mostrarEspecie();
        animal.emitirSonido();
        
        System.out.println();

        Perro perro = new Perro("Mamifero", "Labrador");
        perro.mostrarEspecie();
        perro.emitirSonido();
        perro.ladrar();
    }
}
