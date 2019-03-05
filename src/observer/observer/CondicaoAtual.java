package observer.observer;

import java.util.Observable;
import java.util.Observer;
import observer.observable.DadosMetereologicos;


/**
 *
 * @author Wolf
 */
public class CondicaoAtual implements Observer {
    
    private float temperatura = 0;
    private float pressao = 0;
    private float umidade = 0;
    
    public void exibir() {
        System.out.println("Temperatura (ºC): "+this.temperatura);
        System.out.println("Umidade: "+this.umidade);
        System.out.println("Pressão: "+this.pressao);
    }

    @Override
    public void update(Observable obs, Object obj) {
        if (obs instanceof DadosMetereologicos) {
            DadosMetereologicos DM = (DadosMetereologicos)obs;
            this.temperatura = DM.getTemperatura();
            this.umidade = DM.getUmidade();
            this.pressao = DM.getPressao();
            exibir();
        }
    }
    
}
