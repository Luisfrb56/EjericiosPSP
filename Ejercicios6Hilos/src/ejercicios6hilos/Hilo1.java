package ejercicios6hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo1 extends Thread {
    private Caixa caixa;
    
    /*
    El primer hilo recibe un objeto de tipo caja para que se ejecute el metodo syncronized cuando se ejecute este hilo
    */
    public  Hilo1(Caixa t){
    caixa=t;
    }
    
    public void run() {
       /*
        Un try que entre y ejecute un for 10 veces este hilo
        */
        try {
            for(int i=0;i<10;i++){
                /*
                La cantidad a ingresar es un numero random y tenemos un sout para saber la cantidad que se acaba de ingrasar.
                */
                int monedero=caixa.getMonedero()+((int)(Math.random()*100)+1);
                caixa.setMonedero(monedero);
                System.out.println(i+"Ingresado=" +caixa.getMonedero());
                caixa.ingresar();
                
            }
            /*
            Cuando se haga 10 veces cierra la aplicacion.
            */
            System.exit(0);
        } catch (Throwable ex) {
            Logger.getLogger(Hilo1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
