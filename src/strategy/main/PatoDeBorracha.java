package strategy.main;

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
