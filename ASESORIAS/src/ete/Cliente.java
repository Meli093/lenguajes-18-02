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
public class Cliente {
    
private String nombre;
private Tarjeta tarjeta;


    public Cliente() {
    }

    //TE PERMITE IMPRIMIR TODOS LAS PROPIEDADES DE UN OBJETO EN UNA CADENA DE TEXTO
    @Override //ES UNA SOBRECARGA, QUE SOBREESCRIBE EL METODO POR DEFECTO TOSTRING
    public String toString() {
        return "Los datos del cliente son: " + "nombre=" + nombre + ", tarjeta=" + tarjeta + '}';
    }

    public Cliente(String nombre, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    }

