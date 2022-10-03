
package entrega.individual.ej2;
import javax.swing.JFrame;
import java.lang.Math;

public class EntregaIndividualEj2 {

    
    public static void main(String[] args) {
        Ej2 objcreature = new Ej2();
        objcreature.setVisible(true);
    }
    
    public static double perimetro(double lado) {
        double peri;
        peri=lado*3;
        return peri;
    }
    public static double altura(double lado) {
        double alt;
        alt=(Math.sqrt(3)*lado)/2;
        return alt;
    }
    public static double area(double lado) {
        double area;
        area=(Math.pow(lado,2)*(Math.sqrt(3))/4);
        return area;
    }
    
}
