
package ejercicio2hilos;


public class ClaseHilos extends Thread{
    String str;
    /*
    El hilo recoge un string al inicializarlo para ponerle nombre al hilo
    */
    public ClaseHilos( String str) {
        this.str = str;
    }
    /*
    Entra en el run calcula un Sleep random para que se ejecutn los otros hilos interrumpidamente
    */
    
    public void run(){
        try{
            double k=Math.random();
         Thread.sleep((long) k);
        /*
         for que hace que se ejecuten 5 veces todos los hilos.
         */
        for(int i=0; i<5;i++){
            /*
            Sout que muestra el numero por el que vamos de procesos y el nombre.
            */
            System.out.println(i+" "+str);
            
        }
    }catch(Exception e){
            System.out.println(e);
    }
    }
}

