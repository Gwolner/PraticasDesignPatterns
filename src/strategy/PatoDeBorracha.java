/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import strategy.comportamentograsnar.Silenciar;
import strategy.comportamentovoar.NaoVoa;

/**
 *
 * @author Wolf
 */
public class PatoDeBorracha extends Pato{
    
    PatoDeBorracha(){
        compGrasnar = new Silenciar();
        compVoar = new NaoVoa();
    }
    
    public void apresentar(){
        System.out.println("Eu sou um pato de borracha!");
    }
}
