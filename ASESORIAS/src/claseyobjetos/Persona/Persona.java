/*Constructor
 * Es un metodo de una clase que siempre sse invoca siempre al crear una objeto
 *Tiene el mismo nombre de la clase. No devuelve ningun valor.
 *Debe declararse como publico
 * crear un objeto son 3 cosas que se deben ser.
 * asginacion de memoria para el objetivo.
 *se inicializa los objetos de los atributos.
 *se invoca el constructor de la clase.
 */
package claseyobjetos.Persona;

/**
 *
 * @author my
 */
public class Persona {
//Atributos
//sobre cargada de construstroc es cuando hay mas de 2.    
String nombre;
int edad;


    
//metodos constructor nunca se pone void se pone como el nombre de la clase
public Persona(String nombre, int edad) {//hay 2 parametro distintos.
        this.nombre = nombre;
        this.edad = edad;
    
}


public void mostrardatos() {
    System.out.println("mi Nombre es:"+nombre);
    System.out.println("mi edda es :"+edad);

}
    
}
