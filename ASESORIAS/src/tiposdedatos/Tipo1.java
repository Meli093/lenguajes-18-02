/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdedatos;

/**
 *
 * @author rutil
 */
public class Tipo1 {
    public static void main(String[] args) {
     byte b=2;
        short s=2;
        int i=2;
        long l=2;
        
        b=(byte)s;
        s=b;
        i=b;
        l=i;
        b=(byte)l;
        s=(byte)i;
        float f=4;
        
        String malo="21";
       
     int bueno=     Integer.parseInt(malo);
     int dias=bueno*365;
    }
}    
        
    
    

