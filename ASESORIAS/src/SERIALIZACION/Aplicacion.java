package SERIALIZACION;
public class Aplicacion {
public static void main(String[] args)throws Exception{
    //pues vamos a usar nuestro modelo.
    Cliente c=new Cliente();
    c.setEdad(25);
    c.setNombre("Meliton");
    c.setSueldo(25000);
    PersistenciaUsuario.guardar(c);
    System.out.println("Gardado con exito");


}
    
}
