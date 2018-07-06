package Figuras;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AplicacionFiguras {
public static void main(String[] args) {
    try {
        //creamos un objeto de tipo cuadrado
        Cuadrado c=new Cuadrado();
//agustamos el valor de lado.
ValidarVAlores.validarNoNegativo(0);//se recomienda el 3 opcion de ayuda
c.setLado(4);//este una excepsion de validadcion.
//Generamos un objeto de tipo calculos
Calculo cal=new Calculo();
        System.out.println(cal.calculaPerimetro(c));

    } catch (ValorNegativoException ex) {
        System.out.println(ex.getMessage());//este metodo invoca el costructor ValorNEgativo-
    }
        
}
    
}
