/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FIGURASGEOMETRICA;

/**
 *
 * @author rutil
 */
import java.io.*;
import javax.swing.*;
public class AreaTriangulo {
public static void main(String[] args)throws IOException {

int base, altura;
double area;
base=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la base: "));
altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la altura"));
area=base*altura/2;
JOptionPane.showMessageDialog(null,"El area del triangulo es: "+area);
        
    }
    
}
