package ejercicios7hilos;


public class HiloRecibir extends Thread{
    private Buzon buzon;

    public HiloRecibir( Buzon b ) {
        // Mantiene una copia propia del objeto compartido
        buzon = b;
        }

    public void run() {
        String c;

        // Consume 10 letras de la tuber�a
        for( int i=0; i < 10; i++ )
            {
            c = buzon.borrarM();
            // Imprime las letras retiradas
            System.out.println( "Borrado "+c );
            // Espera un poco antes de coger m�s letras
            try {
                sleep( (int)(Math.random() * 2000 ) );
            } catch( InterruptedException e ) {;}
            }
        }
}
