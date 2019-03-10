package decorator.decoradores;

import decorator.bebidas.Bebida;

/**
 *
 * @author Wolf
 */
public class Leite extends Condimento{
    
    Bebida bebida;
    
    Leite(Bebida bebida){
        this.bebida = bebida;
    }
    
    public String getDescricao(){
        return this.bebida.getDescricao() + " ,Leite";
    }
    
    public double getCusto(){
        return this.bebida.getCusto() + .80;
    }
}
