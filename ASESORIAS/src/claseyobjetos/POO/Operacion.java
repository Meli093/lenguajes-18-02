package claseyobjetos.POO;

import javax.swing.JOptionPane;

public class Operacion {
 //Atributos   
 int numero1;
 int numero2;
 int suma;
 int resta;
 int mult;
 int division;
 
 //metodo
 //pedimos al usuario que nos dijite 2 numeros;
public void leerNumeros(){
numero1 =Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero :"));    
numero2 =Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero :"));
}
public void sumar(){
 suma =numero1+numero2;
} 
public void restar(){
resta = numero1-numero2;
}
public void multiplicacion(){
mult=numero1*numero2;
}
public void dividiendo(){
division=numero1/numero2;

}
public void mostrarResultado(){
System.out.println("La suma es :"+suma);    
System.out.println("la resta es :"+resta);
System.out.println("la multplicacion es :"+mult);
System.out.println("la divsion es"+division);
    

}
}
