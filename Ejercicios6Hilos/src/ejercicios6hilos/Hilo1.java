package ejercicios6hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo1 extends Thread {
    private Caixa caixa;
    
    
    public  Hilo1(Caixa t){
    caixa=t;
    }
    
    public void run() {
       
        try {
            for(int i=0;i<10;i++){
                
                int monedero=caixa.getMonedero()+((int)(Math.random()*100)+1);
                caixa.setMonedero(monedero);
                System.out.println(i+"Ingresado=" +caixa.getMonedero());
                caixa.ingresar();
                
            }
            System.exit(0);
        } catch (Throwable ex) {
            Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
