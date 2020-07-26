package ej1;
import javax.swing.JOptionPane;

public class Ej1 {
    
    
    public static void main(String[] args) {
String Destino;
double KMDistancia,CostoKilometro=2,Total;

Destino = JOptionPane.showInputDialog(null,"Escriba el lugar de destino");
KMDistancia = Double.parseDouble(JOptionPane.showInputDialog(null,"Escriba la cantidad de kilometros para llegar"));
Total = KMDistancia * CostoKilometro;
JOptionPane.showMessageDialog(null, "El valor a pagar para llegar a "+ Destino+ " : $"+Total);



    }
}
