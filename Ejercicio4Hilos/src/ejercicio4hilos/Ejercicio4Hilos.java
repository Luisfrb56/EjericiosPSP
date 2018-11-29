
package ejercicio4hilos;


public class Ejercicio4Hilos {

    public static void main(String[] args) {
        /*
        Inicializamos los hilos de los pares, impares y terminandos en 2 y 3
        */
        HPares hp=new HPares();
        HImpares hi=new HImpares();
        ValoresHilo vh= new ValoresHilo();
        /*
        Iniciamos los hilos.
        */
        hp.start();
        hi.start();
        vh.start();
    }
    
}
