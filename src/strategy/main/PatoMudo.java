/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.main;

import strategy.comportamentograsnar.Silenciar;
import strategy.comportamentovoar.VoarAlto;

/**
 *
 * @author Wolf
 */
public class PatoMudo extends Pato{
    
    PatoMudo(){
        compGrasnar = new Silenciar();
        compVoar = new VoarAlto();
    }
    
    public void apresentacao(){
        System.out.println("Eu sou um pato mudo!");
    }
}
