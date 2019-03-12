package decorator.bebidas;

/**
 *
 * @author Wolf
 */
public class CafePreto extends Bebida{

    public CafePreto(){
        super.descricao = "Café preto";
    }
    
    public double getCusto(){
        return  1.0;
    }
}
