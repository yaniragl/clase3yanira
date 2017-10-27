/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3yanira;
//import java.util.Scanner;
//Paquete para implementar Ventana graficas de usuario
import javax.swing.JOptionPane;

/**
 *
 * @author ceduc
 */
public class ImpuestoGui
{
    
     public static void main(String [] args) 
     {
         int sueldo;
         //Scanner escaner = new Scanner(System.in);
         
         //System.out.println("Ingrese su salario:");
         //Convertimos el string a entero antes de guardarlo
         sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario"));
         //sueldo = escaner.nextInt();
         if(sueldo >600000)
         {
     //System.out.println("debe pagar impuestos");
             
     JOptionPane.showMessageDialog(null,"debe pagar impuestos");
             
                 
             }
             
         }

}  
