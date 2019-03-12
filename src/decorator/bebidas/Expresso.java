package decorator.bebidas;

/**
 *
 * @author Wolf
 */
public class Expresso extends Bebida {
    
    public Expresso(){
        super.descricao = "Expresso";
    }
    
    public double getCusto(){
        return 1.30;
    }
}
