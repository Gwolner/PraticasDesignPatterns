/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.comportamentovoar;

/**
 *
 * @author Wolf
 */
public class NaoVoa implements ComportamentoVoar{
    
    public void voar(){
        System.out.println("<< No chão >>");
    }
}
