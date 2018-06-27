package claseyobjetos;

import javax.swing.JOptionPane;
//argumentos con la invocacion de los metodos
//parametros declaracion de los metdos.
public class Operacion {
 //Atributos   
 int numero1;
 int numero2;
 int suma;
 int resta;
 int mult;
 int division;
 
 //metodo
 //metodo para sumar ambos numeros.
 //dentro de los parentesis son parametros.                 
public void sumar(int num1,int num2){//variables
suma = num1+num2;//este nuestra variable. 
} 
public void restar(int num1,int num2){
    resta = num1-num2;
}
public void multiplicacion(int num1,int num2){
mult = num1*num2;
}
public void dividiendo(int num1,int num2){
division = num1/num2;

}
public void mostrarResultado(){
System.out.println("La suma es :"+suma);    
System.out.println("la resta es :"+resta);
System.out.println("la multplicacion es :"+mult);
System.out.println("la divsion es"+division);

}
}
