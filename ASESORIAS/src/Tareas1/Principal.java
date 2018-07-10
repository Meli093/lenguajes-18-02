/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas1;

/**
 *
 * @author T-101
 */
public class Principal {
public static void main(String[] args) {
Threadsito t1=new Threadsito();
t1.setName("pancho");
Threadsito t2=new Threadsito();
t1.setName("Petra");
Threadsito t3=new Threadsito();
t2.setName("peedro");
Relojito reloj=new Relojito();
//E2


 t1.start();
 t2.start();
 t3.start();
reloj.start();


}}
