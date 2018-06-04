/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POLIMORFISMO2;

/**
 *
 * @author T-101
 */
//la clase de trabjador es abtracta o declarar el cuerpo 
public class Planta extends Trabajador{

    @Override//sobre escribir y garantisar la sintaxi completa
    public void pagar() { //exception es error mas comun abtracto. 
        System.out.println("Se va a pagar a este  trabajador de plant");
    
    
    }
    
}
