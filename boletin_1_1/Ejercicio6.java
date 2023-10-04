package boletin_1_1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce  el primer  numeros para multiplicar");

        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.println("introduce el segundo numero para multiplicar");

        int num2 = sc.nextInt();

        int num3;
        sc.close();

        if (num1 > num2) {

            num3 = num2;
            num2 = num1;
            num1 = num3;
        }
        int resul = 0;

        for (int i = 1; i <= num2; i++) {

            resul += num1;
        }
        System.out.println("El resultado de la multiplicacion es:" + resul);
    }
}
