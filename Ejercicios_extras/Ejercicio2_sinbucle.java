package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio2_sinbucle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("La sucesion de fibonacci es " + fibonacci(4));
    }

    public static int fibonacci(int i) {
        if (i == 1 || i == 2) {


            return 1;
        }

        return fibonacci(i - 1) + fibonacci(i - 2);

}
}
