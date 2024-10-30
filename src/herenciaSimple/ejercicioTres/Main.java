package herenciaSimple.ejercicioTres;

public class Main {
    public static void main(String[] args) {
        Empleado operario = new Empleado("Carlos Gonzales", 1200000);
        Empleado gerenteDeFinanzas = new Gerente("José Rodriguez", 7500000, "Finanzas");

        System.out.println(operario.mostrarDetalles());
        System.out.println(gerenteDeFinanzas.mostrarDetalles());
    }
}
