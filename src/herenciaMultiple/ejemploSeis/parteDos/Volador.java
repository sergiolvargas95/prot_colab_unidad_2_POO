package herenciaMultiple.ejemploSeis.parteDos;

public interface Volador {
    default void despegar() {
        System.out.println("Volador despega.");
    }
}
