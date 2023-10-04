package boletin_1_1;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] agrs) {

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 && i % 13 == 0) {
                System.out.println(" Es multiplo de 7  y 13 " + i);

            } else {
                if (i % 7 == 0) {


                    System.out.println(" Es multiplo de 7 " + i);
                } else {
                    if (i % 13 == 0) {
                        System.out.println(" Es multiplo de 13 " + i);
                    }
                }
            }

        }
    }

}
