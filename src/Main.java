/**
 * Esta clase contiene el método main que inicia la ejecución del programa.
 * 
 * El programa crea una instancia de la clase DeDosEnDos, la cual implementa la interfaz Serie,
 * y luego utiliza este objeto para generar una serie de números comenzando desde el número 1
 * e imprimiendo los siguientes 15 términos de la serie.
 * 
 * @author cheet
 */
public class Main {

    /**
     * El método main inicia la ejecución del programa.
     * 
     * @param args Los argumentos pasados por línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        // Se crea una instancia de la clase DeDosEnDos para generar la serie de números.
        DeDosEnDos serieDos = new DeDosEnDos();
        
        // Se establece el inicio de la serie en 1.
        serieDos.setComenzar(1);
        
        // Se generan y se imprimen los siguientes 15 términos de la serie.
        for (int i = 0; i < 15; i++) {
            System.out.println(serieDos.getSiguiente());
        }
    }   
}
