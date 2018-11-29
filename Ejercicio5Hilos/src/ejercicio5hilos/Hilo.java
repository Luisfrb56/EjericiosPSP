
package ejercicio5hilos;

public class Hilo extends Thread{
    
    String nombre;
    /*
    tenemos nuestro hilo al que le pasamos un nombre
    */
    public Hilo(String Nombre) {
        nombre = Nombre;

    }

    @Override
    public void run() {
        
        /*
        Cuando se ejecuta muestra el nombre del hilo y un saludo.
        */
        System.out.println("Ola, son o " + nombre);

    }

}
