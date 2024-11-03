package clasesAbstractas.ejercicioDos;

public class Main 
{
    public static void main(String[] args) 
    {
        
        Empleado gerente = new Gerente("Carlos", 200.0, 2300.0);
        Empleado vendedor = new Vendedor("Ana", 150.0, 1900.0);

        
        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();
    }
}