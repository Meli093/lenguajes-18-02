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

op.sumar(n1, n2);
op.restar(n1, n2);
op.multiplicacion(n1, n2);
op.dividiendo(n1, n2);
op.mostrarResultado();

    
    
    
    }}
