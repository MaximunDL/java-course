package edu.cibertec.ejercicios;

import java.util.Scanner;

/**
 *
 * @author maximundl
 */
public class Comprension {

    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        int  num1, num2, n = 0;
        int suma = 0;
        
        System.out.println("Ingresar 2 valores distintos que uno sea mayor q el otro");
        System.out.print("Ingrese el primer valor: ");
        num1 = valores.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        num2 = valores.nextInt();
        
        num1 = n;
        num2 = n;
        
        while (num2 <= num1){
            System.out.print("ingrese otro valor mayor: ");
            valores.nextInt();
            
            for (n=num1;n<=num2;n++){
                if(n<num2){

                }
            }
        }
        
        System.out.println("la suma es: " + suma);
    }
}
