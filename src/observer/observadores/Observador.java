/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.observadores;

/**
 *
 * @author Wolf
 */
public interface Observador {
    
    public void atualizar(float temp, float press, float umid);
}
