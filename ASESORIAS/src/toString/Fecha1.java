/*Metodo equals es metodo definidos en la clase Objecty se utiliza comparar objetos.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toString;

/**
 *
 * @author rutil
 */
public class Fecha1 {
private int dia;
private int mes;
private int anio;
 //sobrescribimos el metodo equals que heredamos de object.
 public boolean equals(Object o){
     
 Fecha otra= (Fecha)o;
 return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
 }
 
}
