package boletin_1_1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.println("Introduce un numero del 1 al 10: ");
            num = Integer.parseInt(sc.nextLine());

        } while (num < 0 || num > 10);

        sc.close();
        for (int i =0; i <= 10; i++)
            System.out.printf("%d2 * %d2 = %d3\n ",num, i, num * i);
    }
}
