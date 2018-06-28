/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseyobjetos.Persona.EJE2;

/**
 *
 * @author my
 */
public class Personita {
//Atributos
//sobre cargada de construstroc es cuando hay mas de 2.    
String nombre;
int edad;
String dni;
//metodos constructor nunca se pone void se pone como el nombre de la clase
public Personita(String nombre, int edad) {//este es un constructor
        this.nombre = nombre;
        this.edad = edad;
        
    }
public Personita(String dni) {//este es un constuctor sobre recarga
        this.dni = dni;
    
}
public void Practiar(){
System.out.println("\nsoy :"+nombre+"\nmi edad" +edad+ "\npractio programacion");    
}
public void Practicar(int hrs){//este es un constuctor sobre recarga
    System.out.println("\nhe practicado" +hrs+ "\nen java");    
}
}
    

