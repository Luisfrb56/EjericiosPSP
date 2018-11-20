
package ejercicios7hilos;


public class Buzon {
    
    private String buffer[] = new String[6];
    private int siguiente = 0;
    private boolean tieneC = false;
    private boolean notieneC = true;
    
     public synchronized String borrarM() {
         
          while( notieneC == true )
            {
            try {
                wait(); 
            } catch( InterruptedException e ) {
                
                }
            }
          siguiente--;
        
        if( siguiente == 0 )
            notieneC = true;
        
        tieneC = false;
        notify();
         
         
        return (buffer[siguiente]);  
     }
     public synchronized void recibirM(String c) {
        while( tieneC == true )
            {
            try {
                wait(); // Se sale cuando estaLlena cambia a false
            } catch( InterruptedException e ) {
                ;
                }
            }
        
        buffer[siguiente] = c;
        
        siguiente++;
        
        if( siguiente == 1 )
            tieneC = true;
        notieneC = false;
        notify();
        
         
     }
     
         
}
