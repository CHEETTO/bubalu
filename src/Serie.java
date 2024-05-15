/**
 * Esta interfaz define los métodos necesarios para implementar una serie numérica.
 * Cada clase que implemente esta interfaz deberá proporcionar la lógica para generar
 * los siguientes términos de la serie, reiniciar la serie y establecer el inicio de la serie.
 * 
 * @author cheet
 */
public interface Serie {
    /**
     * Obtiene el siguiente término de la serie.
     * 
     * @return El siguiente término de la serie.
     */
    public int getSiguiente();
    
    /**
     * Reinicia la serie al estado inicial.
     */
    public void reiniciar();
    
    /**
     * Establece el inicio de la serie con el valor dado.
     * 
     * @param x El valor con el que se inicia la serie.
     */
    public void setComenzar(int x);
}
