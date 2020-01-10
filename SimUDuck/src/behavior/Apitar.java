/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavior;

/**
 *
 * @author guilhermewolner
 */
public class Apitar implements QuackBehavior{
    
    @Override
    public void quack() {
        System.out.println("Squeeeak!!");
    }
}
