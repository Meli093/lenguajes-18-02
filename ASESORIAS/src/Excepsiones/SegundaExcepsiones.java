/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepsiones;

/**
 *
 * @author T-101
 */
public class SegundaExcepsiones {

public static void main(String[] args) {
int a=2;
int b=2;
int arreglo[]={1,2};
try{
String numeroMalo="cuatro";
int numeroBueno=Integer.parseInt(numeroMalo);

    System.out.println(a/b);
    System.out.println(numeroBueno*2);
    System.out.println(arreglo[0]);
    
}catch(NumberFormatException e){//busca el error de ñas excepsiones
   
System.out.println("Veamos que excepsion ocurre"+e.getMessage());//se comunica con con el exception    
  
}
    
}}
