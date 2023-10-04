package boletin_1_1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        do {
            System.out.println("Introduce un numero postivo\n");
            num = sc.nextInt();
        } while (num <= 0);

        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        System.out.printf("la suma de los %d  primeros numeros es %d\n", num , suma );
    }
}
