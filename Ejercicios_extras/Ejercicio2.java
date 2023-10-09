package Ejercicios_extras;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = Integer.parseInt(sc.nextLine());
        int f1= 0;
        int f2= 1;
        int fibo = 0;
        int suma;
        sc.close();
        for (int i = 0 ; i < num; i++) {
            fibo = i;
            suma = f1 + f2;
            f2 = suma;
            System.out.println(" el calculo de sucesion de fibonacci"  + num + " es " + f1);
        }
    }
}
