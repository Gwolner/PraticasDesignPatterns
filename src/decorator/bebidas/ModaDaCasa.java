package decorator.bebidas;

/**
 *
 * @author Wolf
 */
public class ModaDaCasa extends Bebida{
    
    public ModaDaCasa(){
        super.descricao = "Moda da Casa";
    }
    
    public double getCusto(){
        return 1.45;
    }
}
