package ej2;
import javax.swing.JOptionPane;
public class Ej2 {
    public static void main(String[] args) {
double presupuesto ,sistemas,contabilidad,colecturia;
presupuesto = Double.parseDouble(JOptionPane.showInputDialog("Cual es el monto que va a pagar"));
colecturia = (presupuesto *35)/100;
contabilidad = (presupuesto * 25)/100;
sistemas = (presupuesto * 40)/100;
JOptionPane.showMessageDialog(null,"Los valores a pagar para cada departamento son :"
        +"\n                    Colecturia : $" +colecturia
        +"\n                    Sistemas : $" +sistemas
        +"\n                    Contabilidad : $" +contabilidad);

    }
}
