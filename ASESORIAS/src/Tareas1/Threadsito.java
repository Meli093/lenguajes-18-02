/*exite 3 forma de generar threads
*1°Hereando la clase Thread
 *2° implementando la interface Runnable
 *3 cursos clases internas anonimas(pregunta de examen).
 * and open the template in the editor.
 */
package Tareas1;

/**
 *
 * @author T-101
 */
public class Threadsito extends Thread{
public  void run(){
    System.out.println("Soy un Thread y me llamo"+Thread.currentThread().getName());  
}
}
