package conversiones;

public class Main {
    public static void main(String[] args) {
    //Crear un objeto de tipo Grados
        Grados g=new Grados();
        //A este objeto le asignamos un valor a su atributo centigrados
        g.setCentigrados(20);
        
        //Creamos un objeto de la clase Conversion
        Convertir c=new Convertir();
        c.setGrados(g); 
        //Aplicar el modelo
        
        
        System.out.println(c.centigradosAFarenheit());
              
        
    }
}