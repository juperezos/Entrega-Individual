
package entrega.individual.ej7;
import javax.swing.JFrame;
import java.lang.Math;
public class EntregaIndividualEj7 {
    public static void main(String[] args) {
        Ej7 objcreature = new Ej7();
        objcreature.setVisible(true);
    }
    public class processing{
        public static double[] transform(String userinput){
            String[] split=userinput.split(",");
            double[] array=new double[split.length];
            for (int i=0; i<split.length; i++){
                array[i]=Double.parseDouble(split[i]);
            }
            return array;
        }
    }
    public class maths{
        public static double[] raiz(double[] array){
            double[] sqrtarray=new double[array.length];
            for (int i=0; i<array.length; i++){
                sqrtarray[i]=Math.sqrt(array[i]);
            }
            return sqrtarray;
        }
        public static double[] cuadrado(double[] array){
            double[] powarray=new double[array.length];
            for (int i=0; i<array.length; i++){
                powarray[i]=Math.pow(array[i], 2);
            }
            return powarray;
        }
        public static double[] cubo(double[] array){
            double[] cubearray=new double[array.length];
            for (int i=0; i<array.length; i++){
                cubearray[i]=Math.pow(array[i], 3);
            }
            return cubearray;
        }
    }
}
