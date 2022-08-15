package edu.cibertec.ejercicios;

public class Decremento {

    public static void main(String[] args) {
        int num = 20;

        //agregar el '>=' por que si no no aprece el 10
        for (num = 20; num >= 10; num--) {
            if (num % 2 == 0) {
                System.out.println(num + " Es par");
            }
        }
    }

}
