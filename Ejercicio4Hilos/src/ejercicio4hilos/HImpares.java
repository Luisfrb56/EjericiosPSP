package ejercicio4hilos;

public class HImpares extends Thread{
    int sumaI;
    
    @Override
     public void run() {
        for (int i = 1; i < 1000; i++) {
            if (i % 2 != 0) {
                sumaI += i;
            }
        }
        System.out.println("Suma Impares= " + sumaI);
    }
}
