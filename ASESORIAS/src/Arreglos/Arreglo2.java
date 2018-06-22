package Arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author rutil
 */
public class Arreglo2 {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
int Elementos;

    int Elemtos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos"));

char[] letras = new char[3];

System.out.println("Digite lo elemento de los arreglos");
    
for (int i = 0; i <3; i++) {
System.out.println((i+1)+"Dijite un elemento");
letras[i]= entrada.next().charAt(0);
    }
            
    }
    
}
