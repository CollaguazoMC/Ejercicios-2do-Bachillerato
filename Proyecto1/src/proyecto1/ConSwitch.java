package proyecto1;
import javax.swing.JOptionPane;
public class ConSwitch {
    public static void main(String[] args) {
    double Distancia,Tiempo,Velocidad;
String Condicion;
    Condicion = JOptionPane.showInputDialog(null,"                                                     Hallar el MRU de un triangulo \n"
        + "Escriba una de las siguientes letras para calcular"
        + " el elemento que necesita sacar el resultado\n\n"
        + "                                           D o d para aplicar la formula de la distancia \n"
        + "                                           T o t para aplicar la formula del tiempo \n"
        + "                                           V o v para aplicar la formula de la velocidad"); 
switch (Condicion) {
    case "D":
    case "d":
        Tiempo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo"));
        Velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad"));
        Distancia = Velocidad * Tiempo;
        JOptionPane.showMessageDialog(null,"La distancia es : " + Distancia);
    break;   
    case "T":
    case "t":
        Distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia"));
        Velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad"));
        Tiempo = Distancia / Velocidad;
        JOptionPane.showMessageDialog(null,"El tiempo es : " + Tiempo);
    break;
    case "V" : 
    case "v" : 
        Distancia = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el tiempo"));
        Tiempo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el distancia"));
        Velocidad = Distancia / Tiempo ;
        JOptionPane.showMessageDialog(null,"La velocidad es : " + Velocidad);
    break;
    default : 
        JOptionPane.showMessageDialog(null,"Error reingrese los datos nuevamente");  
    break;
                }
    }     }
