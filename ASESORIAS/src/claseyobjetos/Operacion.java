package claseyobjetos;
//parametros declaracion de los metdos.
public class Operacion {
 //Atributos   
//int numero1;
 //int numero2;
 //int suma;
 //int resta;
 //int mult;
 //int division;
 
 //metodo
 //metodo para sumar ambos numeros.
 //dentro de los parentesis son parametros.  

public int sumar(int num1,int num2){//variables
    

int suma = num1+num2;//este nuestra variable. 
return suma;
}
public int restar(int num1,int num2){
    
    int resta = num1-num2;
    return resta;
}
public int multiplicacion(int num1, int num2){

    int mult = num1*num2;
    return mult;
}
public int dividiendo(int num1, int num2){
int division = num1/num2;
return division;
}
                            //pasamos los parametros de nuestro metodo  
public void mostrarResultado(int suma,int resta,int mult,int division){
System.out.println("La suma es :"+suma);    
System.out.println("la resta es :"+resta);
System.out.println("la multplicacion es :"+mult);
System.out.println("la divsion es"+division);
}
}
