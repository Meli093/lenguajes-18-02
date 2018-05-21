/*Herencia permite definir clases en funcion de otras clases existentes.
 *es decir una clase como atributos,metodos y ademas heredan atributos y metodos
 *que definen el padre o clase basae.
 *El motodo toString
*Toda las clases heredan de object el metodo toString recibe como parametro es decir
 **////"System.out.println" cual quiera sea el top de datos o objetos.

package toString;

/**
 *
 * @author rutil
 */
public class Fecha {
 private int dia;
private int mes;
private int anio;

// sobrescribimos el metodo toString(lo heredamos de Ojbtec)
public  String toString() // toString se puede sobrescribir para indicar el formato.
{

// retorna una cadena tal como queremos que se vea la fecha
return dia+"/"+mes+"/"+anio;//Nota siempre checar bien si falta un signo o llave etc
}
//:
// setters y getters..
    
}   

