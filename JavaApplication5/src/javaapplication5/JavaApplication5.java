
package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        System.out.println("Ingrese el primer numero:");
        int num1 = numero.nextInt();
        
        System.out.println("Ingrese el segundo numero:");
        int num2 = numero.nextInt();
         
        
        int Suma = num1 + num2;
        int Resta = num1-num2;
        int Mult = num1*num2;
        double Div = (double) num1/num2 ;
        
        System.out.println("Suma: " + Suma);
        System.out.println("Resta: " + Resta);
        System.out.println("Multiplicacion: " + Mult);
        System.out.println("Division: " + Div);
    }
    
}
