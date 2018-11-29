
package ejericio1hilos;

public class Ejericio1Hilos {


    public static void main(String[] args) {
        /*
        Inicializamos dos hilos iguales que se van a ejecutar interrumpidamente
        */
        new ClaseHilos("Primer Hilo").start();
        new ClaseHilos("Segundo Hilo").start();
    }
    
}
