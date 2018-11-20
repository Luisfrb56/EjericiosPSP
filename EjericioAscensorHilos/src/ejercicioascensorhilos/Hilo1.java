package ejercicioascensorhilos;

import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;


public class Hilo1 extends Thread {
    Ascensor ascensor;
    
    public Hilo1(Ascensor a){
        ascensor=a;
    }
     public void run() {
        int c;

        for( int i=0; i < 10; i++ )
            {
            c=Integer.valueOf(JOptionPane.showInputDialog("Piso al que ir:"));
            ascensor.ir1(c);

            try {
                sleep( (int)(Math.random() * 500 ) );
                System.out.println("En camino");
            } catch( InterruptedException e ) {;}
            System.out.println( "Llegada al : "+c+"º Piso");
            }
        }
}
