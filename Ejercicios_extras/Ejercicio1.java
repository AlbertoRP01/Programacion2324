package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el segundo numero");
        int num2 = Integer.parseInt(sc.nextLine());

        sc.close();

        boolean primosEntreSi = true;


        for (int i = 0; i < num && i < num2 && primosEntreSi; i++) {

            if (num % i == 0 && num2 % i == 0) {
                System.out.println("El numero" + i + "Es divisor de " + num + " y de " + num2);
                primosEntreSi = false;
            }
        }
        if (primosEntreSi) {


            System.out.println("los primeros numeros" + num + "y" + num2 + " son primos entre si ");
        }
    }

}



