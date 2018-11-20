package ejercicios6hilos;

public class Hilo2 extends Thread{
    
    private Caixa caixa;
    
    public  Hilo2(Caixa t){
    caixa=t;
    }
    
     public void run() {
       
      for(int i=0;i<5;i++){
            
            int monedero=caixa.getMonedero()-((int)(Math.random()*100+1));
            caixa.setMonedero(monedero);
            System.out.println(i+"Retirar=" +caixa.getMonedero());
            caixa.retirar();
      }
      
    }
}
