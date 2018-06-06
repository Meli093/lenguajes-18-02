package ABSTRACCION;
//Esta clase es tipo modelo por que solamente contien operacion con clase entidad

public class Conversion {
private Grados grados;
    
    private Longitud longitud;

    public float centigradosAFarenheit(){
        //ESte metodo tiene lógica
        
         float resultado= grados.getCentigrados()*1.8f+32;
         return resultado;
    }
    
    public float metrosAPies(){
        //ESte metodo tiene lógica
        
         float resultado= longitud.getMetros()*3.28f;
         return resultado;
    }
    
    
    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }

    public Longitud getLongitudes() {
        return longitud;
    }

    public void setLongitudes(Longitud longitudes) {
        this.longitud = longitudes;
    }
    
}
 