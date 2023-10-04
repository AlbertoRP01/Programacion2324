package boletin1_2;

import java.util.Scanner;

public class Ejercicio13 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce tu comida favorita");

        String comida = sc.nextLine();

        switch (comida) {
            case "hamburguesa":
                System.out.println(" Buena eleccion si te pasas te mueres ");

                break;
            case "pizza":
                System.out.println("amante de la masa y el queso !");

                break;

            case "tacos":
                System.out.println("andale wey estan muy rico");

                break;

            case "ensalada":
                System.out.println("la lechuga del diablo papi");

                break;

        }
    }
}
