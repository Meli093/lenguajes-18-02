package conversiones;


public class Convertir {
Grados g;    
public float centigradosAfar(){
float fa=g.getCentigrados()*1.8f+32;
return fa;
}
public float FarACentrigados(){
float c=(g.getFar()-32)/1.8f;
return c;

}
public float CentrigadosAKelvin(){
float k=(g.getFar()+273;
return k;

public Convertir(Grados g){
    this.g =g;
}


}    

