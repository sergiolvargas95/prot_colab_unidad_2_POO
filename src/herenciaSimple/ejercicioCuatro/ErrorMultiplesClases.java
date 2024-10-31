public class ErrorMultiplesClases
{
    class ClaseA
    {
        public void metodoA()
        {
            System.out.println("Metodo en ClaseA");
        }
    }

    class ClaseB {
        public void metodoB()
        {
            System.out.println("Metodo en ClaseB");
        }
    }

    //Error
    class ClaseC extends ClaseA, ClaseB
    {
        public void metodoC()
        {
            System.out.println("Metodo en ClaseC");
        }
    }
}