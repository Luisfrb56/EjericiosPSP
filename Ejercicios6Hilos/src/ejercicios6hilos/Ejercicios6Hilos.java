package ejercicios6hilos;

public class Ejercicios6Hilos {

    public static void main(String[] args) {
        Caixa caixa=new Caixa();
        
        Hilo1 ingresar=new Hilo1(caixa);
        Hilo2 retirar=new Hilo2(caixa);
        
        ingresar.start();
        retirar.start();
    }
    
}
