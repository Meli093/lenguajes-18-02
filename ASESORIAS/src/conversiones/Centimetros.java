package conversiones;
public class Centimetros {
  private float centimetros;
  private float pies;
  private float metros;  

  
    
    public void pies(){
    pies = centimetros * 3.281f;
    }
    public void pulgadas(){
        pies = metros * 39.37f;
    }
    public double getPies(){
        return pies;
    }
    public double getPulgadas(){
        return pies;
    }
    public void mostrarResultado(){
        System.out.println("\n"+metros+" metros convertidos a pies = " + pies+"\n"+centimetros+" metros convertidos a pulgadas = " + pies);
    }
    public void mostrarResultadoGrafico(){
        javax.swing.JOptionPane.showMessageDialog(null,metros+" metros convertidos a pies = " + pies+"\n"+centimetros+" metros convertidos a pulgadas = " + pies);
    }
}

  