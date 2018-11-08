
package ejercicio4hilos;

public class HPares extends Thread{
    int sumaP;
    
    @Override
    public void run() {
        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0) {
                sumaP += i;
            }
        }
        System.out.println("Suma Pares= " + sumaP);
    }
}
