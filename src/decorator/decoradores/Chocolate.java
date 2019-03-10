package decorator.decoradores;

import decorator.bebidas.Bebida;

/**
 *
 * @author Wolf
 */
public class Chocolate extends Condimento {
    
    Bebida bebida;
    
    Chocolate(Bebida bebida){
        this.bebida = bebida;
    }
    
    public String getDescricao(){
        return this.bebida.getDescricao() + " ,Chocolate";
    }
    
    public double getCusto(){
        return this.bebida.getCusto() + 1.10;
    }
}
