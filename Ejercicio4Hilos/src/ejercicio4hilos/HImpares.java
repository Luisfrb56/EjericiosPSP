package ejercicio4hilos;

public class HImpares extends Thread{
    int sumaI;
    /*
    Un hilo que suma numeros impares
    */
    @Override
     public void run() {
         /*
         un for para coger todos los numeros impares gracias al if
         */
        for (int i = 1; i < 1000; i++) {
            if (i % 2 != 0) {
                sumaI += i;
            }
        }
        System.out.println("Suma Impares= " + sumaI);
    }
}
