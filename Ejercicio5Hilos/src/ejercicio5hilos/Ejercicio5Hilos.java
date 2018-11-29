package ejercicio5hilos;


public class Ejercicio5Hilos {

    public static void main(String[] args) throws InterruptedException {
        /*
        Inicializamos los dos hilos con nombre.
        */
        Hilo h1 = new Hilo("fio1");
        Hilo h2 = new Hilo("fio2");
        /*
        Le metemos nuestra prioridad a cada hilo
        */
        h1.setPriority(1);
        h2.setPriority(10);
        /*
        Iniciamos los hilos
        */
        h2.start();
        h1.start();        
        
        h1.join(10);
       
        
    }
    
}
