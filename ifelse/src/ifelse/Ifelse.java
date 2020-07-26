package ifelse;
import javax.swing.JOptionPane;
/*
if (   variable  |   operador relacional     |   valor o variable    )  {
        
    Codigo que se va a ejecutar si la condiciones es verdadera

    }       
else {

    Codigo que se va a ejecutar si la condicion es falsa

}

Operadores Logicos :                 Operadores Relacionales
&&       -      AND                     ==      Igual a
||       -      OR                      <=      Menor o igual a
!        -      NOT                     >=      Mayor o igual a
*/
public class Ifelse {
    public static void main(String[] args){   
double promedio;

promedio = Double.parseDouble(JOptionPane.showInputDialog(null,"Escriba el promedio del estudiante"));


if(promedio>=7)
{
JOptionPane.showMessageDialog(null,"Aprobado");
}else {

    JOptionPane.showMessageDialog(null,"Reprobado");


}





    }
 }



