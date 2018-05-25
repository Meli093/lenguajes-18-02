package conversiones;
//Esta clase es tipo modelo por que solamente contien operacion con clase entidad

public class Convertir {
private Grados grados;
 private Longitud longitudes;

    Convertir(Grados g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Convertir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 public float centigradosAFarenheit(){
        //ESte metodo tiene lógica
        
         float resultado= grados.getCentigrados()*1.8f+32;
         return resultado;
    }
    
    public float metrosAPies(){
        //ESte metodo tiene lógica
        
         float resultado= longitudes.getMetros()*3.28f;
         return resultado;
    }
    
    
    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }

    public Longitud getLongitudes() {
        return longitudes;
    }

    public void setLongitudes(Longitud longitudes) {
        this.longitudes = longitudes;
    }
    
}

