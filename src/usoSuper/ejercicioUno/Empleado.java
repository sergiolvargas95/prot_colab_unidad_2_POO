package usoSuper.ejercicioUno;

public class Empleado extends Persona {
    private String departamento;

    public Empleado() {}

    public Empleado(String nombre, int edad,  String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public String mostrarDetalles() {
        return "Empleado { " + "\n" +
                "   nombre = " + nombre + ",\n" +
                "   edad = " + edad + ",\n" +
                "   departamento = " + departamento + ",\n" +
                "}";
    }

}
