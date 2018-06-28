/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseyobjetos.Persona;

/**
 *
 * @author my
 */
public class Persona2 {
//Atributos
//sobre cargada de construstroc es cuando hay mas de 2.    
String nombre;
int edad;
String dni;
//metodos constructor nunca se pone void se pone como el nombre de la clase

    
    public Persona2(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        
    }
public Persona2(String dni) {
        this.dni = dni;
    }

    
public void mostrardatos(){
System.out.println("El nombre es :"+nombre);
    System.out.println("la edad es"+edad); 

}}
    

