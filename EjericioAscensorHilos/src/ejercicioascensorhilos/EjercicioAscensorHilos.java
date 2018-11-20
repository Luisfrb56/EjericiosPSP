package ejercicioascensorhilos;


public class EjercicioAscensorHilos {

   
    public static void main(String[] args) {
        Ascensor asc=new Ascensor();
        
        Hilo1 ir=new Hilo1(asc);
        Hilo2 oir=new Hilo2(asc);
        ir.start();
        oir.start();
    }
    
}
