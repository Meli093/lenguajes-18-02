package ETE2EXAMEN;
public class Circulos extends FigurasGemotrica{
private int radio;    

    public Circulos(int r) {
    radio =r;
    }
    public double area(){
    //retorno"Pi por radio al cuadrado"
  return Math.PI*Math.pow(radio, 2);
}    
    
    
}
