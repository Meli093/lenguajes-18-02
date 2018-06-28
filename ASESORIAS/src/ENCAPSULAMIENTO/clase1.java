/*Encapsulamiento
 *consiste en ocultar nuestro metodo y no puedan permitir la visibilidad de atributos y/o métodos, 
 que solamente puede ser midificados o puedan ser usados por cualquier clase o método.
 *  get y set son métodos de "acceso", proporcionan acceso a las propiedades de un objeto. 
   Un método get devuelve el valor de una propiedad de un objeto.
 */
package ENCAPSULAMIENTO;

/**
 *
 * @author my
 */
public class clase1 {
    //metodo
    private String nombre;    
         private int edad;
   //constructor
    public clase1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    ///mostrar la edad
    public int getEdad() {
        return edad;
    }
 ///establece la edad.
    public void setEdad(int edad) {
        this.edad = edad;
    }
}