/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author rutil
 */
public class arreglos {
public static void main(String[] args) {
 int [] valores={1,-20,4};
         //iterar=Recorrer
         for(int i=0;i<valores.length/*length ajusta el tamaño del arreglo*/;i++){
             System.out.println(valores[i]);
         }
         
         //El siguiente ciclo for es el mejorado y se recomienda
         for(int v:valores){
             System.out.println(v);
         }
         
         //Segunda forma de incializar los arreglos pero se recomienda la primera
         
         int otro[]=new int[4];
         for(int valor2:otro){
             System.out.println(valor2);
         }
         
    }        
        
    }
    

