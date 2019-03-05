package observer.observable;

import java.util.Observable;

/**
 *
 * @author Wolf
 */
public class DadosMetereologicos extends Observable{
    
    private float temperatura;
    private float pressao;
    private float umidade;
    
    //Método proprio da classe Dadosmetereologicos
    public void notificarObserver(){
        setChanged(); //Metodo da classe pai
	notifyObservers(); //Metodo da classe pai
    }
    
    
    //Método utilizado para simular alterações das condições climáticas
    public void alterarCondicoes(float temp, float umid, float press){
        this.temperatura = temp;
        this.umidade = umid;
        this.pressao = press;
        notificarObserver();
    }

    public float getTemperatura(){
        return this.temperatura;
    }
    
    public float getPressao(){
        return this.pressao;
    }

    public float getUmidade(){
        return this.umidade;
    }
}
