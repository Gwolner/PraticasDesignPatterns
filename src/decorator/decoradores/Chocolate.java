package decorator.decoradores;

import decorator.bebidas.Bebida;

/**
 *
 * @author Wolf
 */
public class Chocolate extends Condimento {
    
    public Chocolate(Bebida bebida){
        super.bebida = bebida;
    }
    
    public String getDescricao(){
        return super.bebida.getDescricao() + ", Chocolate";
    }
    
    public double getCusto(){
        return super.bebida.getCusto() + 1.10;
    }
}
