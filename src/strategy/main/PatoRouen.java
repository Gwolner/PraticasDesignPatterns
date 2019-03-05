package strategy.main;

import strategy.comportamentograsnar.Grasnar;
import strategy.comportamentovoar.VoarAlto;

/**
 *
 * @author Wolf
 */
public class PatoRouen extends Pato {
    
    PatoRouen(){
        compGrasnar = new Grasnar();
        compVoar = new VoarAlto();
    }
    
    public void apresentar(){
        System.out.println("Eu sou um pato Rouen!");
    }
}
