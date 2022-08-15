
package edu.cibertec.capitulo2.ejercicio3.ejecucion;

import edu.cibertec.capitulo2ejercicio3.logica.Calculadora;
import java.util.Scanner;
/**
 *
 * @author maximundl
 */
public class Ejecutora {
    
    public static void main(String[] args) {
        int operador1 = 15;
        int operador2 = 25;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("ingrese el operador 1:");
        operador1 = scanner.nextInt();
        System.out.println("ingrese el operador 2:");
        operador2 = scanner.nextInt();
        scanner.close();
        
        Calculadora clase = new Calculadora();
        System.out.println("la suma es = " +
                clase.sumar(operador1, operador2));
        System.out.println("la resta es = " +
                clase.restar(operador1, operador2));
        System.out.println("la suma es = " +
                clase.multiplicar(operador1, operador2));
        System.out.println("la suma es = " +
                clase.dividir(operador1, operador2));
    }
}
