package decorator.decoradores;

import decorator.bebidas.Bebida;

/**
 *
 * @author Wolf
 */
public class Leite extends Condimento{
    
    public Leite(Bebida bebida){
        super.bebida = bebida;
    }
    
    public String getDescricao(){
        return super.bebida.getDescricao() + ", Leite";
    }
    
    public double getCusto(){
        return super.bebida.getCusto() + .80;
    }
}
