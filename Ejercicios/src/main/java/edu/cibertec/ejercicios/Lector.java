package edu.cibertec.ejercicios;

import java.util.Scanner;

/**
 *
 * @author maximundl
 */
public class Lector {

    public static void main(String[] args) {
        // inda significa ingrese datos
        Scanner inda = new Scanner(System.in);
        int n, mayor, menor, contados = 0;
        double media = 0;

        System.out.println("Ingrese los numeros, para parar ingrese '0'");
        n = inda.nextInt();

        mayor = n;
        menor = n;
        // se aumenta en 1 el contador
        while (n != 0) {
            contados++;

            //aca se comprueba si el numero es mayor 
            if (n > mayor) {
                mayor = n;
            }

            //aca se comprueba si el numero es menor
            if (n < menor) {
                menor = n;
            }

            //aca aumentamos la media de los numero solicitados
            media += n;

            //seguimos pidiendo datos
            n = inda.nextInt();

        }
        media = media / contados;

        System.out.println("Mostramos los datos: ");
        System.out.println("Se a introducido " + contados + " numeros");
        System.out.println("El numero mator es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("La media es: " + media);
    }

}
