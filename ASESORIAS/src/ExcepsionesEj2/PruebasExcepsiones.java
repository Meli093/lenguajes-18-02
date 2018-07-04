/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcepsionesEj2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import javax.swing.JOptionPane;

public class PruebasExcepsiones {
    
    
public void LeerArchivo() throws FileNotFoundException, IOException{
File archivo=new File("C:\\ejemplo.Txt");
FileReader fr=new FileReader(archivo);
    BufferedReader bf=new BufferedReader(fr);
    String linea;
    
    while((linea = bf.readLine())!=null){
        System.out.println(linea);
    }}
public void LeerArchivo2(){ //capturan direfentes excepsiones.
    try {
    LeerArchivo();
}catch(FileNotFoundException ex){
        JOptionPane.showMessageDialog(null,"NO se enctro el archivo");
    
}catch(IOException e){
JOptionPane.showMessageDialog(null,"HA courrido un error  una excepsion verificada");
}
 System.out.println("Programa terminando");  
}
    public static void main(String[] args) {
    PruebasExcepsiones  Prueba=new PruebasExcepsiones(); 
Prueba.LeerArchivo2();
    }
}
