/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcepsionesEj3;

import static ExcepsionesEj3.DIvision.DIvision_real;

/**
 *
 * @author MR
 */
public class MAin {
    public static void main(String[] args) {
    double x=6;
    double y=3.0;
        try {//ejecutan el orden nuestro bloque la cuales podra lanza nuestra excepsion
            System.out.println("El resultado de la divsion es"+x+"entre"+y+"es"+DIvision_real(x,y));
            //catch : captura las excepsion que hayan podido surgir en bloque previo del try
            //
        } catch (Exception mi_excepsion) {
            System.out.println("Has intentando dividir por 0.0");
            System.out.println("El objetivo de excepsion lanzado :"+mi_excepsion.toString());
        }
    
    }
    
}
