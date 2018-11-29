package ejercicios7hilos;

import javax.swing.JOptionPane;


public class HiloEnviar extends Thread{
    private Buzon buzon;
    

    public HiloEnviar( Buzon b) {
        
        buzon = b;
        }

    public void run() {
        String c;

        // Mandamos 10 veces maximo, un mensaje que nos pedira por JOptionPane
        for( int i=0; i < 10; i++ )
            {
            c=JOptionPane.showInputDialog("Mensaje:");
            buzon.recibirM(c);
            // Imprime que el mensaje haya sido recibido
            System.out.println( "Mensaje recibido: "+c);
            // Espera un poco antes de a�adir m�s letras
            //y lo duerme de manera random
            try {
                sleep( (int)(Math.random() * 100 ) );
            } catch( InterruptedException e ) {;}
            }
        }
}
