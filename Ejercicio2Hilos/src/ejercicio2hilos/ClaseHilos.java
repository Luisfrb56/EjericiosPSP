
package ejercicio2hilos;


public class ClaseHilos extends Thread{
    String str;

    public ClaseHilos( String str) {
        this.str = str;
    }
    public void run(){
        try{
            double k=Math.random();
         Thread.sleep((long) k);
        
        for(int i=0; i<5;i++){
            
            System.out.println(i+" "+str);
            
        }
    }catch(Exception e){
            System.out.println(e);
    }
    }
}

