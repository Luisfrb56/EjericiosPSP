package ejericio3fiosp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejericio3FiosP implements Runnable{

    public static void main(String[] args) {
        Thread hilo = new Thread(new Ejericio3FiosP());  
        hilo.start();
        
    }

    @Override
    public void run() {
        
        System.out.println("Padre: Voy a crear un hijo.");  
                try { 
                    
                    Thread hijo = new Thread(new Hijos()); // Crea el hilo hijo.
                    
                    hijo.start(); // El proceso hijo empieza a estar listo. 
                    
                     
                     hijo.join();
                    
                } catch (InterruptedException ex) { 
                    Logger.getLogger(Ejericio3FiosP.class.getName()).log(Level.SEVERE, null, ex);
                } 
            System.out.println("Padre: Ha terminado el hilo "); 
        } 
    }
    

