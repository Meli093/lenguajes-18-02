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
public class VideoJUego {
  String nombre;
 int  dia; 

    public VideoJUego(int dia) {
        this.dia = dia;
    }
boolean lanzado;

    
    public VideoJUego(String nombre) {
        this.nombre = nombre;
    }

    public VideoJUego(String nombre, int dia, boolean lanzado) {
        this.nombre = nombre;
        this.dia = dia;
        this.lanzado = lanzado;
    }
    
    
}
