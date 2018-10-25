package ejercicio2hilos;


public class Ejercicio2Hilos {

    
    public static void main(String[] args) {
        new ClaseHilos("Primer Hilo").start();
        new ClaseHilos("Segundo Hilo").start();
        new ClaseHilos("Tercero Hilo").start();
        new ClaseHilos("Cuarto Hilo").start();
    }
    
}
