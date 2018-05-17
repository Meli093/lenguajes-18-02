// int son numeros enteros (positivos)
//private encapsula la clase y accederlas por fuera de la clase generar un error compilacion
//El metodo get y set se llaman metodo de acceso que permite acceder los atributos del objeto
package fecha;

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
