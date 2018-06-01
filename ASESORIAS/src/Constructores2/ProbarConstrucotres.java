/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores2;

/**
 *
 * @author rutil
 */
import javax.swing.JFrame;
public class ProbarConstrucotres {

public static void main(String[] args) {
        //Vamos a crear un objeto }
        Persona p1=new Persona("milton");
        Persona p2=new Persona();
        JFrame ventanita = new JFrame("Hola mundo");
        ventanita.setSize(300,300);
        ventanita.setVisible(true);    
}
}