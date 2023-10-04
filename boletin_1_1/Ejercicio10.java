package boletin_1_1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        double factorial = 1;
        do {
            System.out.println("Introduce un numero entero o 0");
            num = sc.nextInt();

        } while (num < 0);

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;



        }
        System.out.printf("%d! = %.0f %n", num, factorial);
    }
}

