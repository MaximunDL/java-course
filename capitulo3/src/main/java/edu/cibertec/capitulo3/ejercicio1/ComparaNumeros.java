package edu.cibertec.capitulo3.ejercicio1;

import java.util.Scanner;

public class ComparaNumeros {

    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero 1:");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese numero 2:");
        numero2 = scanner.nextInt();
        scanner.close();

        if (numero1 > 10 || numero2 > 10) {
            System.out.println("Numeros deben ser menores a 10");
        } else {
            if (numero1 > numero2) {
                System.out.println("Primer numero mayot al segundo");
            } else if (numero2 > numero1) {
                System.out.println("Segundo numero mayor al primero");
            } else {
                System.out.println("Numeros iguales");
            }

            System.out.println("El primer numero es ");
            switch (numero1) {
                case 0:
                    System.out.println("cero");
                    break;
                case 1:
                    System.out.println("uno");
                    break;
                case 2:
                    System.out.println("dos");
                    break;
                case 3:
                    System.out.println("tres");
                    break;
                case 4:
                    System.out.println("cuatro");
                    break;
                case 5:
                    System.out.println("cinco");
                    break;
                case 6:
                    System.out.println("seis");
                    break;
                case 7:
                    System.out.println("siete");
                    break;
                case 8:
                    System.out.println("ocho");
                    break;
                case 9:
                    System.out.println("nueve");
                    break;
                default:
                    System.out.println("es cualquier otro numero");
                    break;
            }
        }

    }
}
