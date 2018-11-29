package ejericio1hilos;

/*
Clase hilo 
*/
public class ClaseHilos extends Thread{
    String str;

    public ClaseHilos( String str) {
        this.str = str;
    }
    /*
    Recoge un String que le damos al inicializarlo
    Entra en el run al hacer el start y hace los dos hilos 10 veces 
    */
    public void run(){
        try{
            /*
            Random para producir el sleep y que se ejecute el otro hilo
            */
            double k=Math.random();
         Thread.sleep((long) k);
        /*
         for para que se haga 10 veces el hilo
         */
        for(int i=0; i<10;i++){
            
            System.out.println(i+" "+str);
            
        }
    }catch(Exception e){
            System.out.println(e);
    }
    }
}
