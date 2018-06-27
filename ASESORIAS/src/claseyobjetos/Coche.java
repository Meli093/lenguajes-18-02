package claseyobjetos;

/**
 *
 * @author my
 */
public class Coche {
String color;
String marca;
int km;
//metodo Es una accion o comportamiento de los objteos.
public static void main(String[] args) {
 Coche c1=new Coche();
 
 c1.color="Blanco";
 c1.marca="Ferrari";
 c1.km=0;

System.out.println("El color de coche es :"+c1.color);
    System.out.println("La marca del auto es"+c1.marca);
    System.out.println("el km del carro es :"+c1.km);
    
}}
