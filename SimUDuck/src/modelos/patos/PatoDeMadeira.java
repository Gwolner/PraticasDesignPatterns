/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.patos;

import behavior.NaoPodeVoar;
import behavior.SemSom;

/**
 *
 * @author guilhermewolner
 */
public class PatoDeMadeira extends Pato{
    
    public PatoDeMadeira(){
        super.nomePato = "Pato de madeira";
        super.quackBehavior = new SemSom();
        super.vooBehavior = new NaoPodeVoar();
    }
    
    //Implementação trocada pelo uso do GoF Strategy
//    @Override
//    public void quack(){
//        System.out.println("-Silêncio-");
//    }
}
