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
public abstract class Trabajador {//here toda la clase  con un extends de defecto
 private String nombre;
 private float sueldoBase;
 private int seguro;
 public abstract void pagar();// esto sirve para evitar el uso de if
     
 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

}