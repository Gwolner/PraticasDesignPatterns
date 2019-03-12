package decorator.main;

import decorator.bebidas.*;
import decorator.decoradores.*;

/**
 *
 * @author Wolf
 */
public class CafeteriaCoffeShow {
    public static void main(String[] args) {
        
        //Criação do pedido de bebida
        Bebida pedido1 = new CafePreto();
        
        //Adição de condimentos
        pedido1 = new Leite(pedido1);
        
        //Exibição de descricao e do valor total
        System.out.println("Pedido: "+pedido1.getDescricao()+".");
        System.out.println("Total: R$"+pedido1.getCusto()+"\n");
        
        
        Bebida pedido2 = new ChaDeHortela();
        pedido2 = new Canela(pedido2);
        System.out.println("Pedido: "+pedido2.getDescricao()+".");
        System.out.println("Total: R$"+pedido2.getCusto()+"\n");
        
        Bebida pedido3 = new ModaDaCasa();
        pedido3 = new Chocolate(pedido3);
        System.out.println("Pedido: "+pedido3.getDescricao()+".");
        System.out.println("Total: R$"+pedido3.getCusto()+"\n");
        
        Bebida pedido4 = new Expresso();
        pedido4 = new Chocolate(pedido4);
        pedido4 = new Caramelo(pedido4);
        System.out.println("Pedido: "+pedido4.getDescricao()+".");
        System.out.println("Total: R$"+pedido4.getCusto()+"\n");

    }
}
