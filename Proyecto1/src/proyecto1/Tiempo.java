package proyecto1;
import javax.swing.JOptionPane;
public class Tiempo {
    public static void main(String[] args) {
        double Distancia,Tiempo,Velocidad;
        Distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia"));
        Velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad"));
        Tiempo = Distancia / Velocidad;
        JOptionPane.showMessageDialog(null,"El tiempo es : " + Tiempo);
    }  
}
