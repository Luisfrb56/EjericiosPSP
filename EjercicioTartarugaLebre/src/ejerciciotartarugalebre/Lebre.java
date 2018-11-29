package ejerciciotartarugalebre;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Lebre extends Thread{
    
    private Controlador control;

    Lebre(Controlador c) {
        /*
        Constructor que guarda un objeto de tipo controlador
        */
         control=c;
    }
    
    @Override
    public void run(){
        /*
        Una metodo que llama al metodo anda lebre
        */
        try {
            control.andaLebre();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lebre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
