package proyecto2;
import javax.swing.JOptionPane;
public class Proyecto2ABCD {
    public static void main(String[] args) {
int A,B,C,D;
A = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la primera fila y primera columna :"));
B = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la segunda fila y primera columna :"));
C = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la primera fila y segunda columna :"));
D = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la segunda fila y segunda columna :"));        
JOptionPane.showMessageDialog(null,"El resultado de la determinante es " + ((A*D)-(B*C)));      
    }
}
