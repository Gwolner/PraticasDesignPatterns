package observer.main;

import observer.observadores.CondicaoAtual;
import observer.sujeito.DadosMetereologicos;

/**
 *
 * @author Wolf
 */
public class EstacaoMetereologica {
 
    public static void main(String[] args) {
        
        DadosMetereologicos DM = new DadosMetereologicos();
        
        CondicaoAtual CA = new CondicaoAtual();
        CA.exibir();
        
        System.out.println("\nAdicionando Observador ao Sujeito:");
        DM.adicionarObservador(CA);
        CA.exibir();
        
        System.out.println("\nAlteração detectada!");
        DM.alterarCondicoes(44, 17, 14.7f);
        
        System.out.println("\nAlteração detectada!");
        DM.alterarCondicoes(38, 26, 19.6f);
        
        System.out.println("\nRemovendo Observador do Sujeito");
        DM.removerObservador(CA);
        
        System.out.println("\nAlteração detectada!");
        DM.alterarCondicoes(31, 21, 9.7f);
        
        
    }
}
