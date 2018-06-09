package Genericos;

/**
 *
 * @author T-101
 */
import java.util.*;
public class AplicacionPreguntas {
    public static void main(String[] args) {
    //Generamos las opciones
Opcion o11=new Opcion();
       o11.setTitulo("Mizcalco");
       o11.setCorrecta(false);
       
       Opcion o21=new Opcion();
       o21.setTitulo("Madrid");
       o21.setCorrecta(true);
       
       Opcion o31=new Opcion();
       o31.setTitulo("Ecatepec");
       o31.setCorrecta(false);
      
        Opcion o41=new Opcion();
       o41.setTitulo("Ecatepec");
       o41.setCorrecta(false);
       
       //Sigue la pregunta
      Pregunta p11=new Pregunta();
      
//antes GENERICO Al arraylist con las acccines de arriba
ArrayList<Opcion>opcionesp11=new ArrayList<>();

//El cuestionario
Cuestionario c1=new Cuestionario();
ArrayList<Pregunta> preguntas=new ArrayList<>();
preguntas.add(p11);
c1.setPreguntas(preguntas);

             for(Pregunta p:preguntas){
                 System.out.println(p.getTitulo());   
                 
                 
                 for (Opcion o:p.getOpciones()){
                 System.out.println(o.getTitulo()+""+o.isCorrecta());
                     
                 }
    
             }

       
    }
    
}
