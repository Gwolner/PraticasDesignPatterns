package decorator.bebidas;

/**
 *
 * @author Wolf
 */
public class ChaDeHortela extends Bebida{
    
    public ChaDeHortela(){
        super.descricao = "Chá de Hortelã";
    }
    
    public double getCusto(){
        return .99;
    }
}
