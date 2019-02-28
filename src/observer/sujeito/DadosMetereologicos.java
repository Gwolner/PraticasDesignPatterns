/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.sujeito;

import java.util.ArrayList;
import observer.observadores.Observador;

/**
 *
 * @author Wolf
 */
public class DadosMetereologicos implements Sujeito{

    private ArrayList listaObservadores;
    private float temperatura;
    private float pressao;
    private float umidade;
    
    public DadosMetereologicos(){
        listaObservadores = new ArrayList();
    }
    
    @Override
    public void adicionarObservador(Observador obs) {
        listaObservadores.add(obs);
    }

    @Override
    public void removerObservador(Observador obs) {
        int i = listaObservadores.indexOf(obs);
        if(i >= 0){
            listaObservadores.remove(i);
        }
    }

    @Override
    public void notificarObservadores() {
        for(int i = 0; i < listaObservadores.size(); i++){
            Observador obs = (Observador) listaObservadores.get(i);
            obs.atualizar(pressao, pressao, umidade);
        }
    }
    
    //Método utilizado para simular alterações das condições climáticas
    public void alterarCondicoes(float temp, float umid, float press){
        this.temperatura = temp;
        this.umidade = umid;
        this.pressao = press;
        notificarObservadores();
    }
    
}
