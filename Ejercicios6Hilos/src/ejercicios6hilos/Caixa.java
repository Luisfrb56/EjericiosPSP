package ejercicios6hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Caixa {
    /*
    Monitor 
    */
    //int monedero que va a ser con la cantidad que empecemos en el banco
    private int monedero = 2000;
    /*
    Dos boolean para activar y desactivar los hilos
    */
    private boolean compro = false;
    private boolean config = false;

    int i = 0;

    public int getMonedero() {
        return monedero;
    }

    public void setMonedero(int monedero) {
        this.monedero = monedero;
    }
    /*
    Creamos el metodo synchronied que saca un int, retirar
    */
    public synchronized int retirar() {

        /*
        Un while que funcionara segun nosotros modifiquemos
        en el otro metodo syncronized a traves de los boolean
        */
        while (compro == false) {
            try {
                /*
                Cuando i entre 4 veces en el metodo, este dejara de 
                usarse entrando en el otro while que activa el otro metodo con el boolean
                */
                while (i == 4) {
                    config = true;
                    notify();
                    wait();
                }
                /*
                Vamos sumando uno a i para que luego cambie de while
                */
                i++;
                notify();
                wait();

            } catch (InterruptedException e) {
            }
        }

        compro = false;
        return monedero;
    }
    /*
    El otro metodo synchronized que sera ingresar
    */
    public synchronized void ingresar() {
        /*
        While que funciona igual que el otro pero con nuestro otro boolean, compro
        */
        while (compro == true) {
            
            try {
                
                if (config == false) {
                    

                    notify();
                    wait();
                }else{
                  compro=false;
                 
                          
                }
                
            } catch (InterruptedException e) {
            } catch (Throwable ex) {
                Logger.getLogger(Caixa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        compro = true;
    }

}
