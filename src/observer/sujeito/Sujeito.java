package observer.sujeito;

import observer.observadores.Observador;

/**
 *
 * @author Wolf
 */
public interface Sujeito {
    public void adicionarObservador(Observador obs);
    public void removerObservador(Observador obs);
    public void notificarObservadores();
}
