/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.patos;

import behavior.QuackBehavior;
import behavior.VooBehavior;

/**
 *
 * @author guilhermewolner
 */
public class Pato {
    
    String nomePato;
    
    //Atributos de apoio ao comportamento dinâmico dos patos
    VooBehavior vooBehavior;
    QuackBehavior quackBehavior;
    

    
    public void nadar(){
        System.out.println(nomePato+" está nadando...");
    }
    
    public void exibir(){
        System.out.println("Imagem do pato "+nomePato);
    }
    
    //Métodos que chamam métodos específicos dos atributos de apoio
    public void performVoo(){
        this.vooBehavior.voar();
    }
    
    public void performQuack(){
        this.quackBehavior.quack();
    }
    
    
    //Implementação trocada pelo uso do GoF Strategy
//    public void quack(){
//        System.out.println(nomePato+" fez quack!");
//    }   
    
    //Implementação trocada pelo uso do GoF Strategy
//    public void voar(){
//        System.out.println(nomePato+" está voando!");
//    }
    
    
    
}