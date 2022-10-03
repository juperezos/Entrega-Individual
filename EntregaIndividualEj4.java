
package entrega.individual.ej4;
import javax.swing.JFrame;

public class EntregaIndividualEj4 {
        
    public static void main(String[] args) {
        Ej4 objcreature = new Ej4();
        objcreature.setVisible(true);
    }
     
    public static double patrimonizador(double pat, double estSoc){
        double base=50000;
        if (pat>2000000 && estSoc>3){
            base=base+(0.03*pat);
        }
        return base;
    }
    
    }

