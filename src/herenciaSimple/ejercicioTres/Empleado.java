package herenciaSimple.ejercicioTres;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado() {}

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarDetalles() {
        return "Empleado { " + "\n" +
                "   nombre = " + nombre + ",\n" +
                "   salario = " + salario + ",\n" +
                "}";
    }
}
