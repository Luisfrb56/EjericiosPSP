package ejercicios6hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Caixa {

    private int monedero = 2000;
    private boolean compro = false;
    private boolean config = false;

    int i = 0;

    public int getMonedero() {
        return monedero;
    }

    public void setMonedero(int monedero) {
        this.monedero = monedero;
    }

    public synchronized int retirar() {

//        System.out.println("Retirar=" + monedero);
        while (compro == false) {
            try {
                while (i == 4) {
                    config = true;
                    notify();
                    wait();
                }
                i++;
                notify();
                wait();

            } catch (InterruptedException e) {
            }
        }

        compro = false;
        return monedero;
    }

    public synchronized void ingresar() {
//        System.out.println("Ingresado=" + monedero);
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
