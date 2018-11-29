package ejercicios7hilos;


public class HiloRecibir extends Thread{
    private Buzon buzon;

    public HiloRecibir( Buzon b ) {
        
        buzon = b;
        }

    public void run() {
        String c;

        // Ejecuta un maximo de 10 veces los hilos
        for( int i=0; i < 10; i++ )
            {
                /*
                Borra el mensaje que tengamos dentro
                */
            c = buzon.borrarM();
            //Imprime que haya sido borrado
            System.out.println( "Borrado "+c );
            // Espera un poco antes de borrar otro mensaje
            try {
                sleep( (int)(Math.random() * 2000 ) );
            } catch( InterruptedException e ) {;}
            }
        }
}
