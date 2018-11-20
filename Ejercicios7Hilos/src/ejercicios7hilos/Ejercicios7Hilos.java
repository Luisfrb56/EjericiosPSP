package ejercicios7hilos;


public class Ejercicios7Hilos {

    public static void main(String[] args) {
        Buzon buzon=new Buzon();
        
        HiloEnviar env=new HiloEnviar(buzon);
        HiloRecibir rec=new HiloRecibir(buzon);
        env.start();
        rec.start();
    }
    
}
