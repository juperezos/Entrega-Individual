
package entrega.individual.ej3;
import javax.swing.JFrame;
import java.lang.Math;


public class EntregaIndividualEj3 {

    public static void main(String[] args) {
        Ej3 objcreature = new Ej3();
        objcreature.setVisible(true);
    } 
    public static String compare(double a, double b){
        String string;
        string="";
        if(a>b){
            string="A>B";
        }
        else if (a<b){
            string="B>A";
        }
        else if (a==b){
            string="A=B";
        }
        return string;
    }
    
}

