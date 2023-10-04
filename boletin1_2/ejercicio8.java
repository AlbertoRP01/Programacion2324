package boletin1_2;

import java.util.Scanner;

public class ejercicio8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] agrs) {

        System.out.println("Introduce el nivel");

        int nivel = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce los mapas completados");
        int mapa = Integer.parseInt(sc.nextLine());

        if (nivel > 10 && mapa > 20) {

            System.out.println(" Tienes acceso a la mision especial ");
        } else {
            System.out.println(" no tienes acceso a la mision especial ");
        }
    }


}
