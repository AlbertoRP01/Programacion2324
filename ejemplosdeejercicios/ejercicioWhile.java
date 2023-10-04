package ejemplosdeejercicios;

import java.util.Scanner;

public class ejercicioWhile {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] agrs) {
        System.out.println("introduce un numero");
        int num = sc.nextInt();
        int i = 2;

        while (num % i != 0) {

            i++;
        }

        if (num == i) {
            System.out.println(i + " es un numero primo ");
        } else {
            System.out.println(" El primer divisor es " + i);
        }

    }
}

