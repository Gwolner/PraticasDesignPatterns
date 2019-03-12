package decorator.decoradores;

import decorator.bebidas.Bebida;

/**
 *
 * @author Wolf
 */
public class Caramelo extends Condimento{
    
    public Caramelo(Bebida bebida){
        super.bebida = bebida;
    }
    
    public String getDescricao(){
        return super.bebida.getDescricao() + ", Caramelo";
    }
    
    public double getCusto(){
        return super.bebida.getCusto() + .95;
    }
}
