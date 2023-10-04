package boletin_1_1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {


            System.out.println("Introduce una cantidad de numeros");
            num = sc.nextInt();

        }
        while (num <= 0);

        int suma = 0;

        for (int i = 1; i <= num; i++) {

            System.out.println("introduce el siguiente  numero");

            int num2 = sc.nextInt();

            suma += num2;


        }
        double media = (double) suma / num;
        System.out.println("la media es 2" + media);

    }
}
