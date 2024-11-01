package sobreEscrituraMetodos.ejercicioTres;


/*
 * Esto ya no sería sobreescritura sino sobrecarga de metodos, utilizamos
 * @Override para identificar que queremos aplicar sobrescritura y así Java
 * nos arroja el error correcto y así mejoramos la legibilidad del código.
 * Aplicar @Override es una buena practica porque evitamos errores de firma accidental.
 */
public class Cuadrado extends Figura{
    public int area(int lado) {
        return (lado * lado);
    }
}
