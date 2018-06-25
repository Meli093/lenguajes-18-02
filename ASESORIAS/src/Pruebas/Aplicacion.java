/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

/**
 *
 * @author Moises Martin Campos
 */
public class Aplicacion {
    public static void main(String[] args) {
       VideoJUego jueguito=new VideoJUego("NFL");
       VideoJUego j2=new VideoJUego(1);
       VideoJUego j3=new VideoJUego("NFL", 1, true);
       System.out.println(jueguito.nombre);
        
        
    }
    
}
