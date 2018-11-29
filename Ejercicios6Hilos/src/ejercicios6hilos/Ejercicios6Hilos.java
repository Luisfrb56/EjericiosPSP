package ejercicios6hilos;

public class Ejercicios6Hilos {

    public static void main(String[] args) {
        /*
        Inicializamos el objeto de tipo caixa(Nuestro monitor)
        */
        Caixa caixa=new Caixa();
        /*
        Dentro de la inicializacion de nuestros hilos metemos el objeto tipo caixa
        */
        Hilo1 ingresar=new Hilo1(caixa);
        Hilo2 retirar=new Hilo2(caixa);
        /*
        Los iniciamos
        */
        ingresar.start();
        retirar.start();
    }
    
}
