package ejericio3fiosp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejericio3FiosP implements Runnable{

    public static void main(String[] args) {
        /*
        main que crea un hilo con la clase Hijo que extiende de esta 
        misma clase el metodo Run que se implementa con el Runnable
        */
        Thread hilo = new Thread(new Ejericio3FiosP());  
        hilo.start();
        
    }

    @Override
    public void run() {
        /*
        Clase run, cuando entra manda un sout que dice que el padre va a crear un hijo.
        */
        System.out.println("Padre: Voy a crear un hijo.");  
                try { 
                    
                    Thread hijo = new Thread(new Hijos()); // Crea el hilo hijo.
                    
                    hijo.start(); // El proceso hijo empieza a estar listo. 
                    
                     /*
                    ejecute el hijo
                    */
                     hijo.join();
                    
                } catch (InterruptedException ex) { 
                    Logger.getLogger(Ejericio3FiosP.class.getName()).log(Level.SEVERE, null, ex);
                } 
            System.out.println("Padre: Ha terminado el hilo "); 
        } 
    }
    

