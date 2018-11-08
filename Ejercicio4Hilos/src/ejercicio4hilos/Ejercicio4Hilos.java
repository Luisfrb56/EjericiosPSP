
package ejercicio4hilos;


public class Ejercicio4Hilos {

    public static void main(String[] args) {
        HPares hp=new HPares();
        HImpares hi=new HImpares();
        ValoresHilo vh= new ValoresHilo();
        
        hp.start();
        hi.start();
        vh.start();
    }
    
}
