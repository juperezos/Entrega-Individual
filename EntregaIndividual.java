
package entrega.individual1;

import javax.swing.JFrame;
public class EntregaIndividual {

    
    public static void main(String[] args) {
        Ej1 objcreature = new Ej1();
        objcreature.setVisible(true);
    }
    public static double salario_bruto_met(double horas, double valor) {
    double salbruto;
    salbruto=horas*valor;
    return salbruto;
    }
    public static double salario_neto_met (double horas, double valor, double ret){
    double salneto;
    salneto = (horas*valor)-((horas*valor)*(ret/100));
    return salneto;
    }
    
}
