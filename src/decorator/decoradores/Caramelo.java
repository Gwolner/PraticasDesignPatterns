package decorator.decoradores;

import decorator.bebidas.Bebida;

/**
 *
 * @author Wolf
 */
public class Caramelo extends Condimento{
    
    Bebida bebida;
    
    Caramelo(Bebida bebida){
        this.bebida = bebida;
    }
    
    public String getDescricao(){
        return this.bebida.getDescricao() + " ,Caramelo";
    }
    
    public double getCusto(){
        return this.bebida.getCusto() + .95;
    }
}
