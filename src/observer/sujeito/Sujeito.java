/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
