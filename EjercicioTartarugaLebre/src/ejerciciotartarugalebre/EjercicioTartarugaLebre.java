package ejerciciotartarugalebre;

public class EjercicioTartarugaLebre {

 
    public static void main(String[] args) {
        /*
        Inicializamos en controlador de los hilos.
        */
       Controlador control=new Controlador();
       
       /*
       Inicializamos los Hilos pasandole el objeto de tipo controlador que pedimos en el construcor
       */
       Lebre lebre=new Lebre(control);
       Tartaruga tartaruga=new Tartaruga(control);
       /*
       Iniciamos los hilos
       */
       lebre.start();
       tartaruga.start();
        
    }
    
}
