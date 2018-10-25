
package ejericio3fiosp;

public class Hijos extends Ejericio3FiosP {
    
    public Hijos(){
        
    }
    public void run() { 
         
        try { 
                 
           for(int i=1;i<=5;i++){
               int k=(int)(Math.random()*60+10);
               Thread.sleep(k); 
               for(int l=0;l<10;l++){
            System.out.println("Soy el hijo "+i+" "+this.hashCode()); 
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
