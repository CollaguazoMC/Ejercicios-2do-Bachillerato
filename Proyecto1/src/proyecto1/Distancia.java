package proyecto1;
import javax.swing.JOptionPane;
public class Distancia {
    public static void main(String[] args) {
double Distancia,Tiempo,Velocidad;
Tiempo = Double.parseDouble(JOptionPane.showInputDialog(null,"Escriba el tiempo"));
Velocidad = Double.parseDouble(JOptionPane.showInputDialog(null,"Escriba el velocidad"));
Distancia = Tiempo * Velocidad ;
JOptionPane.showMessageDialog(null,"El resultado es : " + Distancia);
    }
}
