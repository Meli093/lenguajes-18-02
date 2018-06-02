/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMC;

/**
 *
 * @author rutil
 */
import javax.swing.*;
public class imc {
float peso;
float altura;
float imc;
public imc(float peso, float altura, float imc) {
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
       
        
        if (imc<18.5f) {

            System.out.println("BAJO PESO");

        } else if (imc>=18.5f && imc<=24.9f) {

            System.out.println("NORMAL");

        } else if (imc>=25 && imc<=29.9f) {

            System.out.println("SOBREPESO");

        } else {

            System.out.println("OBESIDAD");

        }        
        
    
   
    
    
    
    
    }




}
