package ejerciciotartarugalebre;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tartaruga extends Thread{
    
    private Controlador control;

    Tartaruga(Controlador c) {
        /*
        Constructor que guarda un objeto de tipo controlador
        */
        control=c;
    }
    
    @Override
    public void run(){
        /*
        Un metodo que llama al metodo anda tartaruga
        */
        try {
            control.andaTartaruga();
        } catch (InterruptedException ex) {
            Logger.getLogger(Tartaruga.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
