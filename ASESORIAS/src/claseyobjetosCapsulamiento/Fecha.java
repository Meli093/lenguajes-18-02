/*los metodos de una clase se escriben como funciones.Dentro de los metodos
 * los atributos son variables globales.
 *get y set son metodos para asignarles un valor a ss atributos.
 * int son numeros enteros (positivos)
 * private encapsula la clase y accederlas por fuera de la clase generar un error compilacion
 */
package claseyobjetosCapsulamiento;

/**
 *
 * @author rutil
 */
public class Fecha {
private int dia;
  private int mes;
  private int anio;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
