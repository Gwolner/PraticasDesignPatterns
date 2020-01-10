/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.patos;

import behavior.Grasnar;
import behavior.VoarComAsas;

/**
 *
 * @author guilhermewolner
 */
public class CabecaVermelha extends Pato{
    
    public CabecaVermelha(){
        super.nomePato = "Cabeça-Vermelha";
        super.quackBehavior = new Grasnar();
        super.vooBehavior = new VoarComAsas();
    }
}
