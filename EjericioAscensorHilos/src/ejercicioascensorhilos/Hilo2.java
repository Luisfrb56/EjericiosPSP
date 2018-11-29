
package ejercicioascensorhilos;

import static java.lang.Thread.sleep;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;


public class Hilo2 extends Thread{
    Ascensor ascensor;
    
    public Hilo2(Ascensor a){
        ascensor=a;
    }
     public void run() {
        int c;

        /*
        lo ejecutamos 10 veces maximo
        */
        for( int i=0; i < 10; i++ )
            {
                /*
                Le pasamos el piso al que queramos ir
                y ejecutamos el metodode la clase monitor.
                */
            c=Integer.valueOf(JOptionPane.showInputDialog("Piso al que ir:"));
            
                if(c<=20){
                    
            ascensor.ir2(c);
             /*
                imprimimos Ascensor en camino 
                */
            System.out.println("En camino");
            System.out.println( "Llegada al : "+c+"º Piso");
                    
                }
                
            try {
                /*
                Pasamos a minutos la unidad, eligiendo un minuto para sleep
                */
                TimeUnit.MINUTES.sleep(1);
               

                
            } catch( InterruptedException e ) {;}
            
            }
        }
}
