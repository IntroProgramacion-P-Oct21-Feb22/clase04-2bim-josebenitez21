/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;


/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   int a=obtenerSuma (10);
    double b= obtenerMultiplicacion(600);
        System.out.printf("Resultado de los valores a operar:"
                + "%d\n%.2f",a,b);
    }
    
    
    public static int obtenerSuma(int a){
        int b ;
        b = a;
        return b;
    }
    
    public static double obtenerMultiplicacion(int b){
        double resultado;
        resultado = (double)b/10;
        return resultado;
    }
    
    
}
