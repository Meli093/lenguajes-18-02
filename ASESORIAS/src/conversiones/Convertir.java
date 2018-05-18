package conversiones;


public class Convertir {
 Grados g;
 public float centigradosAfar(){
  float fa=g.getCentigrados()*1.8f+32;
  
  return fa;
 }
public float FarACentrigrados(){
  float c=(g.getFar()-32)/1.8f;
  
  return c;
}
public float centigradosAKelvin(){
  float k=(g.getCentigrados()+273);
  
  return k;
}
    public Convertir(Grados g) {
        this.g = g;
    }
}

