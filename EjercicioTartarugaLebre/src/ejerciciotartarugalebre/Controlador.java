package ejerciciotartarugalebre;

public class Controlador {
    /*
    Iniciamos la posicion a 1
    */
    private int pLebre=1;
    private int pTartaruga=1;
   
    
    
    public synchronized void andaLebre() throws InterruptedException{
        
            /*
            Que siempre entre hasta que la posicion no sea mayor o igual que 70
            */
        while(pLebre<70){
            /*
            Sacamos un numero random para calcular los porcentajes dentro de los ifs
            */
             int n= (int) (Math.random() * 10) + 1;
             /*
             Calculamos los porcentajes para que entre y se mueva la liebre, ademas donde restamos calculamos para que no pueda dar negativo.
             */
             if(n<=2){
            System.out.println("LIEBRE: NO ANDA");
            
            }
             
             else if(2< n && n <=4){
            pLebre+=9;
            
            System.out.println("LIEBRE: ANDA 9");
            }
            
             else if(4<n&&n<=5){
            pLebre -= 12;
            if(pLebre<1){
                pLebre=1;
            }
            System.out.println("LIEBRE: ATRAS 12");
            }
            
             else if(5<n&&n<=8){
            pLebre+= 1;
            System.out.println("LIEBRE: ANDA 1");
            }
            
             else if(8<n){
             pLebre-=2;  
             if(pLebre<1){
                pLebre=1;
            }
             System.out.println("LIEBRE: ATRAS 2");
            }
             
             /*
            tenemos un if para que llegue al final y cierre la aplicacion ademas de indicar quien gano.
            */
             if(pLebre>=70){
                System.out.println("GANOU A LEBRE");
                System.exit(0);
            }
             /*
             para este y llama al siguiente movimiento de la tortuga
             */
             notify();
            wait();
            
        }
        
        
        notify();
    }
    
    public synchronized void andaTartaruga() throws InterruptedException{
        /*
        Que siempre entre hasta que la posicion no sea mayor o igual que 70
        */
        while(pTartaruga<70){
            /*
            Sacamos un numero random para calcular los porcentajes dentro de los ifs
            */
             int n= (int) (Math.random() * 10) + 1;
             /*
             Calculamos los porcentajes para que entre y se mueva la tortuga, ademas donde restamos calculamos para que no pueda dar negativo.
             */
            if(n<=5){
                pTartaruga+=3;
                 System.out.println("TARTARUGA: ANDA 3");
            }else if(5< n && n <=7){
                pTartaruga-=6;
                if(pTartaruga<1){
                   pTartaruga=1;
                }
                System.out.println("TARTARUGA: ATRAS 6");
                
            }else if(n>=8){
               pTartaruga+=1;
               System.out.println("TARTARUGA: ANDA 1");
            }
            /*
            tenemos un if para que llegue al final y cierre la aplicacion ademas de indicar quien gano.
            */
                    
            if(pTartaruga>=70){
                System.out.println("GANOU A TARTARUGA");
                System.exit(0);
            }
            /*
             para este y llama al siguiente movimiento de la lebre
             */
             notify();
             wait();
        }
        
       
        notify();
    }
}
