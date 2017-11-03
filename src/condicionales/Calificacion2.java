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
public class Calificacion2 
{
  public static void main(String[] args)
 {
     float nota;
      nota = Float.parseFloat(JOptionPane.showInputDialog("ingrese nota"));
      if (nota = 7)
      {
          JOptionPane.showMessageDialog(null, "Notable");
      }
 }
}
