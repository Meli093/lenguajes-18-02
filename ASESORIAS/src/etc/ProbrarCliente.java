/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etc;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class ProbrarCliente {
    public static void main(String[] args, Tarjeta Tarjeta) {
        for(Cliente c:new GeneradorTarjetas().getClientes()){
                 System.out.println(c);  
        }
   
    
    }
        
    }
    

