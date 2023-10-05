package boletin1_2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce tu nombre ");
        String nombre = sc.nextLine();

        System.out.println("Introduce tu edad ");
        int edad = Integer.parseInt(sc.nextLine());
;        System.out.println("introduce tu altura ");
        double altura = Double.parseDouble(sc.nextLine());

         System.out.println(" Mi nombre es " + nombre + " tengo " + edad+ " y mido " + altura);


    }
}
