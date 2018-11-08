package ejercicio5hilos;


public class Ejercicio5Hilos {

    public static void main(String[] args) throws InterruptedException {
        Hilo h1 = new Hilo("fio1");
        Hilo h2 = new Hilo("fio2");
        
        h1.setPriority(1);
        h2.setPriority(10);
        
        h2.start();
        h1.start();        
        
        h1.join(10);
       
        
    }
    
}
