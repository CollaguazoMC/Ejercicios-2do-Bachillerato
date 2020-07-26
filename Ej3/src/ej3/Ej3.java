package ej3;
import javax.swing.JOptionPane;
public class Ej3 {
    public static void main(String[] args) {
String Producto;
double PrecioProducto,PorcentajeGanancias,Total;
Producto = JOptionPane.showInputDialog(null,"Escriba el nombre del producto");
PrecioProducto = Double.parseDouble(JOptionPane.showInputDialog("Escriba el precio del producto"));
PorcentajeGanancias = Double.parseDouble(JOptionPane.showInputDialog("Escriba el porcentaje de ganancia del producto"));
PorcentajeGanancias = (PorcentajeGanancias * PrecioProducto)/100;
Total = PorcentajeGanancias+PrecioProducto;
JOptionPane.showMessageDialog(null, "Producto : " + Producto 
        +"\nCosto del producto : $" + PrecioProducto 
        +"\nPorcentaje de ganancias : $" + PorcentajeGanancias 
        +"\nTotal : $" + Total);

    }  
}
