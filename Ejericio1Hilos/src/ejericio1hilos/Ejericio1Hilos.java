
package ejericio1hilos;

public class Ejericio1Hilos {


    public static void main(String[] args) {

        new ClaseHilos("Primer Hilo").start();
        new ClaseHilos("Segundo Hilo").start();
    }
    
}
