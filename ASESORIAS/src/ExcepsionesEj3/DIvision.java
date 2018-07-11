package ExcepsionesEj3;
public class DIvision {
public static double DIvision_real(double dividiendo,double divisor) throws Exception {
        
    double aux;
        if (divisor!=0) {
         aux=dividiendo/divisor;
        }
        else
        {
        throw new Exception();
        }   
        return aux;
        
    }}
    

