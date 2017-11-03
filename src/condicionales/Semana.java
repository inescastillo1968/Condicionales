/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB10
 */
public class Semana
{
      public static void main(String[] args)
      {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        switch(numero)
            
        {
           case 1:
          JOptionPane.showMessageDialog(null, "Lunes");     
           break;
           case 2://caso 2 si el valor es 6
          JOptionPane.showMessageDialog(null, "Martes");     
           break;
            case 3://caso 3 si el valor es 5
          JOptionPane.showMessageDialog(null, "Miercoles");     
           break;
             case 4://caso 4 si el valor es 4
          JOptionPane.showMessageDialog(null, "Jueves"); 
            case 5://caso 4 si el valor es 4
          JOptionPane.showMessageDialog(null, "Viernes");
           break;
            case 6://caso 4 si el valor es 4
          JOptionPane.showMessageDialog(null, "Sabado");
           break;
            case 7://caso 4 si el valor es 4
          JOptionPane.showMessageDialog(null, "Domingo");
           break;
           
               
           } 
      }
}
