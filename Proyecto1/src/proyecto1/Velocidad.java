package proyecto1;
import javax.swing.JOptionPane;
public class Velocidad {
    public static void main(String[] args) {
        double Distancia,Tiempo,Velocidad;
        Distancia = Double.parseDouble(JOptionPane.showInputDialog("Escriba la distancia"));
        Tiempo = Double.parseDouble(JOptionPane.showInputDialog("Escriba el tiempo"));
        Velocidad = Distancia / Tiempo ; 
        JOptionPane.showMessageDialog(null,"El resultado de la velocidad es  : " + Velocidad);
    }
}
