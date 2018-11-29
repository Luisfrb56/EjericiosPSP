package ejercicios6hilos;

public class Hilo2 extends Thread{
    
    private Caixa caixa;
    /*
    El segundo hilo recibe un objeto de tipo caja para que se ejecute el metodo syncronized cuando se ejecute este hilo
    */
    public  Hilo2(Caixa t){
    caixa=t;
    }
    
     public void run() {
       /*
         un for para que se ejecute 5 veces el metodo retirar
         */
      for(int i=0;i<5;i++){
            /*
            se retira una cantidad random
            */

            int monedero=caixa.getMonedero()-((int)(Math.random()*100+1));
            caixa.setMonedero(monedero);
            /*
            Un sout que muestra la cantidad que le acaban de quitar.
            */
            System.out.println(i+"Retirar=" +caixa.getMonedero());
            caixa.retirar();
      }
      
    }
}
