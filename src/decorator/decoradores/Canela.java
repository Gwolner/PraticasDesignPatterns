package decorator.decoradores;

import decorator.bebidas.Bebida;

/**
 *
 * @author Wolf
 */
public class Canela extends Condimento {
    
    public Canela(Bebida bebida){
        super.bebida = bebida;
    }
    
    public String getDescricao(){
        return super.bebida.getDescricao() + ", Canela";
    }
    
    public double getCusto(){
        return super.bebida.getCusto() + .70;
    }
}
