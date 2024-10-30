package usoSuper.ejercicioUno;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona() { }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarDetalles() {
        return "Persona { " + "/n" +
                "   nombre = " + nombre + ",/n" +
                "   edad = " + edad + ",/n" +
                "}";
    }
}
