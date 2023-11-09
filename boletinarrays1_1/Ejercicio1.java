package boletinarrays1_1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int suma = 0;
        int[] miarray = {1, 2, 5, 22, 7, 9};

        for (int i : miarray) {
            if (i % 2 == 0) {
                suma += 0;
            }
            System.out.println("la suma de los numeros pares es:" + suma);
        }

    }
}
