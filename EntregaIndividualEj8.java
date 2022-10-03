package entrega.individual.ej8;
import javax.swing.JFrame;
import java.lang.Math;
public class EntregaIndividualEj8 {
    public static void main(String[] args) {
        Ej8 objcreature = new Ej8();
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
        public static double[] sorter(double[] array){
            double n=array.length, temp=0;
             for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(array[j-1] > array[j]){   
                                 temp = array[j-1];  
                                 array[j-1] = array[j];  
                                 array[j] = temp;  
                          }
                 }
             }
             return array;
        }
    }
 }

