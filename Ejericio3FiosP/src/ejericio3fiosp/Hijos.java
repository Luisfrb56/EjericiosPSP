
package ejericio3fiosp;

public class Hijos extends Ejericio3FiosP {
    /*
    extiende de la clase main el metodo run
    */
    public Hijos(){
        
    }
    
    public void run() { 
         
        try { 
            /*
            un for que hace que se ejecuten 5 hilos
            y lo duerme una vez termine
            */
                 
           for(int i=1;i<=5;i++){
               int k=(int)(Math.random()*60+10);
               Thread.sleep(k); 
               /*
               Van a ser 5 hijos que se ejecutan estas 10 veces
               */
               for(int l=0;l<10;l++){
                   /*
                   marca el numero el hijo que es.
                   */
            System.out.println("Soy el hijo "+i+" "+this.hashCode()); 
            /*
            Cuando termine de ejecutarse informa que ya termino.
            */
            if(l==9){
                System.out.println("El hijo "+i+" Termino");
            }
               }
           }
        }  
        catch (InterruptedException e) { 
                System.out.println(e); 
                return; 
        } 
    } 
}
