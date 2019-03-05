package observer.observadores;

/**
 *
 * @author Wolf
 */
public interface Observador {
    
    public void atualizar(float temp, float press, float umid);
}
