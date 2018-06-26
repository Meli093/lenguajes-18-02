/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class GeneradorTarjetas {
     private ArrayList<Cliente> clientes;  

    public GeneradorTarjetas() {
        clientes=new ArrayList<>();
        clientes.add(new Cliente("Juan", new Tarjeta(1234, "Banamex", 32000)));
        clientes.add(new Cliente("ana", new Tarjeta(5679, "HSBC", 17500)));
        clientes.add(new Cliente("pedro", new Tarjeta(19600, "scotian",19600)));
        clientes.add(new Cliente("irma", new Tarjeta(4321, "Bancomer", 48000)));
    }

    public GeneradorTarjetas(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
  
        
    }

