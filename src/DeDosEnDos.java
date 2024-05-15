/**
 * Esta clase implementa la interfaz Serie y representa una serie numérica 
 * donde cada término se obtiene sumando 2 al término anterior.
 * 
 * @author cheet
 */
public class DeDosEnDos implements Serie {
    // Atributos
    private int valorInicial;
    private int valorActual;
    
    /**
     * Constructor por defecto que inicializa los valores iniciales y actuales a 0.
     */
    public DeDosEnDos() {
        this.valorInicial = 0;
        this.valorActual = 0;
    }

    /**
     * Obtiene el valor inicial de la serie.
     * 
     * @return El valor inicial de la serie.
     */
    public int getValorInicial() {
        return valorInicial;
    }

    /**
     * Obtiene el valor actual de la serie.
     * 
     * @return El valor actual de la serie.
     */
    public int getValorActual() {
        return valorActual;
    }

    /**
     * Establece el valor inicial de la serie.
     * 
     * @param valorInicial El nuevo valor inicial de la serie.
     */
    public void setValorInicial(int valorInicial) {
        this.valorInicial = valorInicial;
    }

    /**
     * Establece el valor actual de la serie.
     * 
     * @param valorActual El nuevo valor actual de la serie.
     */
    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }

    /**
     * Establece el inicio de la serie con el valor dado.
     * 
     * @param x Valor con el que se inicia la serie.
     */
    @Override
    public void setComenzar(int x) {
        this.valorInicial = x;
        this.valorActual = x;
    }

    /**
     * Reinicia la serie al valor inicial.
     */
    @Override
    public void reiniciar() {
        this.valorActual = this.valorInicial;
    }

    /**
     * Obtiene el siguiente término de la serie sumando 2 al valor actual.
     * 
     * @return El siguiente término de la serie.
     */
    @Override
    public int getSiguiente() {
        this.valorActual = this.valorActual + 2;
        return this.valorActual;
    }
}
