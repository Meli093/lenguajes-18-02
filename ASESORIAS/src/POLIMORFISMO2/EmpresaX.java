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
public class EmpresaX {
    public static void main(String[] args) {
        Planta p1=new Planta();
        Planta p2=new  Planta();
        
        Honorarios h1=new Honorarios();
        Honorarios h2=new Honorarios();
        Honorarios h3=new Honorarios();
        
        Proyecto Pro1=new  Proyecto();
        Trabajador[]trab={p1,p2,h1,h2,h3,Pro1, new Proyecto() };//polimorfismo siempre lo aceptar siepre sea subtipos de la superior. 
    
        for (Trabajador t: trab) {
            t.pagar(); 
        }
    
    }
    
}
