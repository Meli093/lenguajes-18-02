/*serializamos a nuestra clase usuario
 * 
 */
package SERIALIZACION;

/**
 *
 * @author T-101
 */
import java.io.*;
public class PersistenciaUsuario {
//primero guardamos
public static void guardar(Cliente c)throws Exception{
//vamos a generr el arch donde se va guardadr 
//nuestro serializado
File file=new File("D:\\archivardo yomero");
//Paso 2 indicar que lo vamos a generarpara escribir en el.
FileOutputStream fos=new FileOutputStream(file);
//Escribir un objeto  en el
ObjectOutput oos=new ObjectOutputStream(fos);
oos.writeObject(c);
oos.close();

}
}
