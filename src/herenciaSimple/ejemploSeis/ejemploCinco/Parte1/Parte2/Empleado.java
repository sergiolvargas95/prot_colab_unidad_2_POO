package herenciaSimple.ejemploSeis.ejemploCinco.Parte1.Parte2;

public class Empleado 
{
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) 
    {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void mostrarDetalles() 
    {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}
