
package simuduck;

import modelos.patos.CabecaVermelha;
import modelos.patos.Mallard;
import modelos.patos.PatoDeBorracha;
import modelos.patos.PatoDeMadeira;


/**
 *
 * @author guilhermewolner
 */
public class SimUDuck {

    public static void main(String[] args) {
        
        //Forma baseada no padrão GoF Strategy
        Mallard mallard = new Mallard();
        
        mallard.exibir();
        mallard.performQuack();
        mallard.nadar();
        mallard.performQuack();
        mallard.performVoo();
        
        System.out.println("\n");
        
        CabecaVermelha cv = new CabecaVermelha();
        
        cv.exibir();
        cv.performQuack();
        cv.nadar();
        cv.performQuack();
        cv.performVoo();
        
        System.out.println("\n");
        
        PatoDeBorracha pdb = new PatoDeBorracha();
        
        pdb.exibir();
        pdb.performQuack();
        pdb.nadar();
        pdb.performQuack();
        pdb.performVoo();
        
        System.out.println("\n");
        
        PatoDeMadeira pdm = new PatoDeMadeira();
        
        pdm.exibir();
        pdm.performQuack();
        pdm.nadar();
        pdm.performQuack();
        pdm.performVoo();
        
        
//        //Forma baseada em herança que leva ao erro
//        Mallard mallard = new Mallard();
//        
//        mallard.exibir();
//        mallard.quack();
//        mallard.nadar();
//        mallard.quack();
//        mallard.voar();
//        
//        CabecaVermelha cv = new CabecaVermelha();
//        cv.exibir();
//        cv.quack();
//        cv.nadar();
//        cv.quack();
//        cv.voar();

    }
}
