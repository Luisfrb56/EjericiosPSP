
package ejercicio4hilos;

public class ValoresHilo extends Thread{
    
    int sumaV;
    /*
    Suma de los numeros que terminen en dos y tres
    */
    
    @Override
    public void run() {
        /*
         un for para coger todos los numeros que terminan en 2 y 3 gracias al if
        */
        for (int i = 1; i < 1000; i++) {
            if (i % 10 == 2 || i % 10 == 3) {

                sumaV += i;
                
            }
            
        }
        System.out.println("Suma acabados en 2 y 3= " + sumaV);

    }
}
