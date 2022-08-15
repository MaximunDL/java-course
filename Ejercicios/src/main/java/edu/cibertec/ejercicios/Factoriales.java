package edu.cibertec.ejercicios;

import java.util.Scanner;

public class Factoriales {

    public static void main(String[] args) {
        Scanner innu = new Scanner(System.in);

        // pido el numero a calcular
        System.out.print("Inregese numero: ");
        int numero = innu.nextInt();

        // se muestra el resultado
        System.out.println("El factorial de: " + numero + " es: " + factorial(numero));
    }

    public static double factorial(int n) {
        double aux = 1;
        for (int i = 2; i <= n; i++) {
            aux *= i;
        }
        return aux;
    }
}
