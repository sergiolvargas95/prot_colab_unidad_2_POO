package usoSuper.ejercicioDos;

public class Main 
{
    public static void main(String[] args) 
    {
        Animal animal = new Animal("Mamífero");
        Pez pez = new Pez("Pez", "Agua dulce");

        
        animal.mostrarEspecie();  
        pez.mostrarEspecie();     
    }
}