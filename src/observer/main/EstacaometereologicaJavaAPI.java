package observer.main;

import observer.observable.DadosMetereologicos;
import observer.observer.CondicaoAtual;

/**
 *
 * @author Wolf
 */
public class EstacaometereologicaJavaAPI {
    
    public static void main(String[] args) {
        
        DadosMetereologicos DM = new DadosMetereologicos();
		
        CondicaoAtual CA = new CondicaoAtual();

        DM.addObserver(CA);

        DM.alterarCondicoes(80, 65, 30.4f);
        DM.alterarCondicoes(82, 70, 29.2f);
        DM.alterarCondicoes(78, 90, 29.2f);
        System.out.println("=====================");
        CA.update(DM, null);
        CA.update(DM, null);
        CA.update(DM, null);
    }
}
