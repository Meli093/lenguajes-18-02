/*
 *clase objeto.
 */
package claseyobjetos.POO;

/**
 *
 * @author my
 */
public class MainOperacion {
    public static void main(String[] args) {
        
    Operacion op=new Operacion();//este es mi objeto
    op.leerNumeros();
    op.sumar();
    op.restar();
    op.multiplicacion();
    op.dividiendo();
    op.mostrarResultado();
}}
