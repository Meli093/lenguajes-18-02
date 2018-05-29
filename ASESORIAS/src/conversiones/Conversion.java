package conversiones;
//Esta clase es tipo modelo por que solamente contien operacion con clase entidad

public class Conversion {
  private Grados grados;
    
    public float centigradosAFarenheit(){
        //Este metodo tiene logica
        
        float resultado1= (grados.getCentigrados()*1.8f)+32;
        return resultado1;
    }
    
    public float FarenheitaCentigrados(){
        float resultado2=(grados.getFarenheit()-32f)/1.80f;
        return resultado2;
    }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }
    



    private Longitud longitud;
    
    public float metrosAPies(){
        float resultadoMaP=longitud.getMetros()*3.28f;
        return resultadoMaP;
    }
    
    public float PiesAMetros(){
        float resulatadoPaM=longitud.getPies()*0.30f;
        return resulatadoPaM;
    }

    public Longitud getLongitud() {
        return longitud;
    }

    public void setLongitud(Longitud longitud) {
        this.longitud = longitud;
    }
    
}
