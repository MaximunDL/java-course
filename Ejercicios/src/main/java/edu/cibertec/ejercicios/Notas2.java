package edu.cibertec.ejercicios;

import java.util.Scanner;

/**
 *
 * @author maximundl
 */
public class Notas2 {

    public static void main(String[] args) {
        double nota;
        int aprobados = 0, reprobados = 0;
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Notas: ");
            nota = leer.nextDouble();

            if (nota < 13) {
                reprobados++;
            } else if (nota >= 13) {
                aprobados++;

            }

            System.out.println("\nAlumnos reprobados: " + reprobados);
            System.out.println("Alumnos aprobados: " + aprobados);

        }
    }
}
