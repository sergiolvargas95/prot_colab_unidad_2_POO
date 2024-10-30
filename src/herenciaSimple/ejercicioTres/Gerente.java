package herenciaSimple.ejercicioTres;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente() {}

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String mostrarDetalles() {
        return "Gerente {" + "\n" +
                "   nombre = " + nombre + ",\n" +
                "   salario = " + salario + ",\n" +
                "   departamento = " + departamento + ",\n" +
                "}";
    }
}
