package proyecto2;
import javax.swing.JOptionPane;
public class Proyecto2 {
    public static void main(String[] args) {
int []c1 = new int [2];
int []c2 = new int [2];

c1[0] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la primera fila y primera columna :"));
c1[1] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la segunda fila y primera columna :"));
c2[0] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la primera fila y segunda columna :"));
c2[1] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de la segunda fila y segunda columna :"));

JOptionPane.showMessageDialog(null,"El resultado de la diagonal principal es : " + c1[0]*c2[1]+
        "\nEl resultado de la diagonal segundaria es : " + (c1[1]*c2[0])+
        "\nEl resultado de la determinante de segundo grado es : " + (  ( c1[0]*c2[1] )-( c1[1]*c2[0] ) )   );
    }
}
