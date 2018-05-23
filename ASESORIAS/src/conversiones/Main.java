package conversiones;

public class Main {
    public static void main(String[] args) {
   Grados g=new Grados();
     g.setCentigrados(20);
     Convertir convertir=new Convertir(g);
     
        System.out.println(convertir.centigradosAfar());
        g.setFar(68);
       System.out.println(convertir.FarACentrigrados()); 
        System.out.println(convertir.centigradosAKelvin()); 
        
    pies p=new pies();
    p.setmetros(3.281);
    Conversiones conversiones=new Conversiones(p);
    
    
        System.out.println(conversiones.getPies());
        p.setcentimetros(39.37);
         System.out.println(conversiones.getCentimetros());
          System.out.println(conversiones.getMetros());
    }
}