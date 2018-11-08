
package ejercicio5hilos;

public class Hilo extends Thread{
    
    String nombre;

    public Hilo(String Nombre) {
        nombre = Nombre;

    }

    @Override
    public void run() {
        
        
        System.out.println("Ola, son o " + nombre);

    }

}
