public class PruebaEstudiante 
{
    public static void main(String[] args) 
    {
        Persona persona = new Persona("David", 30);
        persona.mostrarDetalles();

        Estudiante estudiante = new Estudiante("Ana", 18, "1235007");
        estudiante.mostrarDetalles();
    }
}
