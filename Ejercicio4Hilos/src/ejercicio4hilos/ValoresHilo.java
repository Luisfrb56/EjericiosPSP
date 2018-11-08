
package ejercicio4hilos;

public class ValoresHilo extends Thread{
    
    int sumaV;

    @Override
    public void run() {

        for (int i = 1; i < 1000; i++) {
            if (i % 10 == 2 || i % 10 == 3) {

                sumaV += i;
            }
        }
        System.out.println("Suma acabados en 2 y 3= " + sumaV);

    }
}
