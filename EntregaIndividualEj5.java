
package entrega.individual.ej5;
import javax.swing.JFrame;

public class EntregaIndividualEj5 {
    
    public static void main(String[] args) {
        Ej5 objcreature = new Ej5();
        objcreature.setVisible(true);
        
    }
    public static double  discriminante(double salario,double horas) {
        double salmensual=salario*horas;
        if (salmensual>450000){
            return salmensual;
        }
        else {
            return 0;
        }
        
    }
    
}
