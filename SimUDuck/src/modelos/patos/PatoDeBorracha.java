/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.patos;

import behavior.Apitar;
import behavior.NaoPodeVoar;

/**
 *
 * @author guilhermewolner
 */
public class PatoDeBorracha extends Pato{
    
    public PatoDeBorracha(){
        super.nomePato = "Pato de borracha";
        super.quackBehavior = new Apitar();
        super.vooBehavior = new NaoPodeVoar();
    }
    
    //Implementação trocada pelo uso do GoF Strategy
//    @Override
//    public void quack(){
//        System.out.println("Squeeeak");
//    }
}
