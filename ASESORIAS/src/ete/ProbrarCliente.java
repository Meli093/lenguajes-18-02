/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

/**
 *
 * @author T-101
 */
public class ProbrarCliente {
 public static void main(String[] args) {
        //ciclo for  sirve para inicializar  una variable de cntrol.
            //inicilizacion, condicion ,incremento.
        for(Cliente c:new GeneradorTarjetas().getClientes()){
                 System.out.println(c.toString());  
        
        }}}
    

