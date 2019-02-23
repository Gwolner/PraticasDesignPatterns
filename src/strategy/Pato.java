package strategy;

import strategy.comportamentograsnar.ComportamentoGrasnar;
import strategy.comportamentovoar.ComportamentoVoar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wolf
 */
public class Pato  {
    
    ComportamentoGrasnar compGrasnar;
    ComportamentoVoar compVoar;
    
    public void setGrasnar(ComportamentoGrasnar cg){
        this.compGrasnar = cg;
    }
    
    public void setVoar(ComportamentoVoar cv){
        this.compVoar = cv;
    }
    
    public void getGrasnar(){
        compGrasnar.grasnar();
    }
    
    public void getVoar(){
        compVoar.voar();
    }
}
