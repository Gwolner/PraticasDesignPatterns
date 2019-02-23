/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import strategy.comportamentograsnar.Grasnar;
import strategy.comportamentovoar.VoarAlto;

/**
 *
 * @author Wolf
 */
public class PatoCabecaVermelha extends Pato {
    
    PatoCabecaVermelha(){
        compGrasnar = new Grasnar();
        compVoar = new VoarAlto();
    }
    
    public void apresentar(){
        System.out.println("Eu sou um pato Cabeça Vermelha!");
    }
    
}
