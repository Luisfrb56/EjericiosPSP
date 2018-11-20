package ejercicios7hilos;

import javax.swing.JOptionPane;


public class HiloEnviar extends Thread{
    private Buzon buzon;
    

    public HiloEnviar( Buzon b) {
        
        buzon = b;
        }

    public void run() {
        String c;

        // Mete 10 letras en la tuber�a
        for( int i=0; i < 10; i++ )
            {
            c=JOptionPane.showInputDialog("Mensaje:");
            buzon.recibirM(c);
            // Imprime un registro con lo a�adido
            System.out.println( "Mensaje recibido: "+c);
            // Espera un poco antes de a�adir m�s letras
            try {
                sleep( (int)(Math.random() * 100 ) );
            } catch( InterruptedException e ) {;}
            }
        }
}
