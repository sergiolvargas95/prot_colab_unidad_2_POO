package ejemploSeis.ejemploDos;

public class Coche extends Vehiculo {
    public Coche(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
        //Esto nos generará un error de compilación, ya que marca es un atributo privado
        //Si deseamos extenderlo a Coche debemos cambiar su acceso a protected
        System.out.println(marca);
    }
}
