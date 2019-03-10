package decorator.bebidas;

/**
 *
 * @author Wolf
 */
public abstract class Bebida {
    String descricao;
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public abstract double getCusto();
}
