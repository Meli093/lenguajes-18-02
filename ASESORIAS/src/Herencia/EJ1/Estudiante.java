package Herencia.EJ1;

public class Estudiante extends Persona{
    //A hora llamos nuestro construcor.
private int CodigoEstudiante;
private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad,int CodigoEstudiante,float notaFinal ) {
        super(nombre, apellido, edad);
        this.CodigoEstudiante=CodigoEstudiante;
        this.notaFinal=notaFinal;
    }

   

      public void mostrarDatos(){
        System.out.println("Nombre :"+getNombre()+"\n apellido :"+getApellido()+
                "\n edad:"+getEdad()+"\n codigo Estudiante"+CodigoEstudiante+"\n Nota final"+notaFinal);
            
    }}



