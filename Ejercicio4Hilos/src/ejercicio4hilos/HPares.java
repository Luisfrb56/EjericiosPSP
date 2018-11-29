
package ejercicio4hilos;

public class HPares extends Thread{
    int sumaP;
    /*
    Un hilo que suma numeros pares
    */
    @Override
    public void run() {
        /*
         un for para coger todos los numeros pares gracias al if
         */
        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0) {
                sumaP += i;
            }
        }
        System.out.println("Suma Pares= " + sumaP);
    }
}
