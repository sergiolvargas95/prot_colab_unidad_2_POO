public class ErrorAtributosPriv
{
    class Vehiculo 
    {
        private String marca;
    
        public Vehiculo(String marca) 
        {
            this.marca = marca;
        }
    }
    
    class Coche extends Vehiculo 
    {
        public Coche(String marca) 
        {
            super(marca);
        }
    
        public void mostrarMarca() 
        {

            System.out.println("Marca: " + marca);
        }
    }
}
