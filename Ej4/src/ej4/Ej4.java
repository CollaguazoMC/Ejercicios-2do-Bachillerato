package ej4;
import java.lang.Math;
import javax.swing.JOptionPane;
public class Ej4 {
    public static void main(String[] args){
    double Peso , Estatura , IMC;
Peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Escriba su peso en kilogramos"));
Estatura = Double.parseDouble(JOptionPane.showInputDialog(null,"Escriba su estatura en metros"));  
IMC = Peso / (Math.pow(2,Estatura));
JOptionPane.showMessageDialog(null,"El indice de masa corporal es " + IMC);
     } 
}
    
    
    
    
    


