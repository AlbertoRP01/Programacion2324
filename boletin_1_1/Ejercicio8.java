package boletin_1_1;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num;
        double menor = Double.MAX_VALUE;

        do {
            System.out.println("introduce un numero");
            num = sc.nextDouble();
            menor = num;


            System.out.println("quieres introducir mas numeros (s/n");
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break;

            }

        } while (true);
        if (menor == Double.MAX_VALUE) {
            System.out.println("No has introducido ningun numero");
        } else {
            System.out.println("el numero menor es " + menor);
        }
    }
}
