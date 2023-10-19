package boletin1_4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int num = sc.nextInt();
        sc.close();
        int numB = Math.abs(num);
        int i;


        for (i = 0; numB >= 10; i++) {
            numB /= 10;
        }
        System.out.println("El numero %d tiene %d cifras" + num + "tiene" + i + " cifras ");
    }
}

