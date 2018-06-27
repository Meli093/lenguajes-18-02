/*
 *clase objeto.
 */
package claseyobjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author my
 */
public class MainOperacion {
    public static void main(String[] args) {
        
  
 int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));
int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));
Operacion op=new Operacion();

//primera opcion
int suma=op.sumar(n1, n2);
int resta=op.restar(n1, n2);
int multiplicacion=op.multiplicacion(n1, n2);
int divsion=op.dividiendo(n1, n2);
op.mostrarResultado(suma, resta, suma, divsion);

//segunda opcion
//System.out.println("la suma es"+op.sumar(n1, n2));
//System.out.println("la resta es"+op.restar(n1, n2));    
  
    
    }}
