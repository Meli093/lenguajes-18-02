//Los metodos de una clase se escriben como funciones.
//Dentro del metodo podemos acceder a los atributos de la clase de variables globales
package claseyobjetosEncapsulamiento;

/**
 *
 * @author rutil
 */
public class TestFecha {
public static void main(String[] args) {
Fecha f=new Fecha();
f.setDia(2);//la variable dia es privada,no tenemos acceso
f.setMes(10);//idem
f.setAnio(1970);//ovidalo...

//imprimo el dia 
System.out.println("Dia="+f.getDia());

//imprimo el mes
System.out.println("Mes="+f.getMes());

//imprimo el año
System.out.println("Anio="+f.getAnio());

//imprimo el fecha
System.out.println(f);


}
    
}
