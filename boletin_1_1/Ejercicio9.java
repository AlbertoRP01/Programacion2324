package boletin_1_1;

import java.util.Scanner;

public class Ejercicio9 {


    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {

            if (esPerfecto(i)){

                System.out.printf("El numero %d es perfecto\n", i);
            }


        }
    }

    public static boolean esPerfecto(int a) {


        int suma = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {

                suma += i;


            }

        }

        return suma == a;


    }

}


