package ejercicioascensorhilos;


public class EjercicioAscensorHilos {

   
    public static void main(String[] args) {
        /*
        Inicializamos el Ascensor
        */
        Ascensor asc=new Ascensor();
        /*
        le pasamos a los hilos el objeto ascensor
        */
        Hilo1 ir=new Hilo1(asc);
        Hilo2 oir=new Hilo2(asc);
        /*
        iniciamos los hilos.
        */
        ir.start();
        oir.start();
    }
    
}
