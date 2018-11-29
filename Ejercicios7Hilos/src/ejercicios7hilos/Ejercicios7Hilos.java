package ejercicios7hilos;


public class Ejercicios7Hilos {

    public static void main(String[] args) {
        /*
        Inicializamos la clase buzon(nuestro monitor)
        */
        Buzon buzon=new Buzon();
        /*
        Inicializar los hilos pasandole el objeto buzon
        */
        HiloEnviar env=new HiloEnviar(buzon);
        HiloRecibir rec=new HiloRecibir(buzon);
        /*
        iniciamos los hilos
        */
        env.start();
        rec.start();
                
    }
    
}
