package strategy.main;

import strategy.comportamentograsnar.Grasnar;
import strategy.comportamentovoar.Foguete;

/**
 *
 * @author Wolf
 */
public class SimuladorDePatos {
    
    public static void main(String[] args) {
        
        PatoDeBorracha pdb = new PatoDeBorracha();
        pdb.apresentar();
        pdb.getGrasnar();
        pdb.getVoar();
        
        System.out.println("");
        PatoCabecaVermelha pcv = new PatoCabecaVermelha();
        pcv.apresentar();
        pcv.getGrasnar();
        pcv.getVoar();
        
        System.out.println("");
        PatoDeMadeira pdm = new PatoDeMadeira();
        pdm.apresentar();
        pdm.getGrasnar();
        pdm.getVoar();
        
        System.out.println("");
        PatoMudo pm = new PatoMudo();
        pm.apresentacao();
        pm.getGrasnar();
        pm.getVoar();
        
        System.out.println("");
        PatoRouen pr = new PatoRouen();
        pr.apresentar();
        pr.getGrasnar();
        pr.getVoar();
        
        System.out.println("\nAlterando comportamento dos patos:");
        
        pdb.apresentar();
        pdb.getVoar();
        System.out.println("Equipei foquetes!");
        pdb.setVoar(new Foguete());
        pdb.getVoar();
        
        System.out.println("");
        pdm.apresentar();
        pdm.getGrasnar();
        pdm.getVoar();
        System.out.println("Equipando mecanismo de som!");
        pdm.setGrasnar(new Grasnar());
        pdm.getGrasnar();
        System.out.println("Equipando foguetes!");
        pdm.setVoar(new Foguete());
        pdm.getVoar();
        
    }
    
}
