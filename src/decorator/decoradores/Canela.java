package decorator.decoradores;

import decorator.bebidas.Bebida;

/**
 *
 * @author Wolf
 */
public class Canela extends Condimento {
    
    Bebida bebida;
    
    Canela(Bebida bebida){
        this.bebida = bebida;
    }
    
    public String getDescricao(){
        return this.bebida.getDescricao() + " ,Canela";
    }
    
    public double getCusto(){
        return this.bebida.getCusto() + .70;
    }
}
