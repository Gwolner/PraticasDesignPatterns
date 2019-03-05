package observer.observadores;

/**
 *
 * @author Wolf
 */
public class CondicaoAtual implements Observador, Exibicao {
    
    private float temperatura = 0;
    private float pressao = 0;
    private float umidade = 0;
    
    @Override
    public void atualizar(float temp, float umid, float press) {
        this.temperatura = temp;
        this.umidade = umid;
        this.pressao = press;
        exibir();
    }

    @Override
    public void exibir() {
        System.out.println("Temperatura (ºC): "+this.temperatura);
        System.out.println("Umidade: "+this.umidade);
        System.out.println("Pressão: "+this.pressao);
    }
    
    
}
