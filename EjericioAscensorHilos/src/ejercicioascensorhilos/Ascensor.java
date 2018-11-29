package ejercicioascensorhilos;


public class Ascensor {
    private int buffer[] = new int[20];
    private int siguiente = 0;
    private boolean camino = false;
    private boolean nocamino = true;
    
 public synchronized void ir1(int c) {
     /*
     metodo synchronized mandandole un int 
     tenemos un while que activar o desactivar el metodo.
     */
        while( nocamino == true )
            {
            try {
                wait(); 
            } catch( InterruptedException e ) {
                ;
                }
            }
        
        buffer[siguiente] = c;
        
        siguiente++;
        
        if( siguiente == 1 )
            nocamino = true;
        camino = false;
        notify();
        
         
 }
  public synchronized void ir2(int c) {
      /*
     metodo synchronized mandandole un int que es el piso alque ira
     tenemos un while que activar o desactivar el metodo.
     */
        while( camino == true )
            {
            try {
                wait(); 
            } catch( InterruptedException e ) {
                ;
                }
            }
        
        buffer[siguiente] = c;
        
        siguiente++;
        
        if( siguiente == 1 )
            camino = true;
        nocamino = false;
        notify();
        
         
     }
}
