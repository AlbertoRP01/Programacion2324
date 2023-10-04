package boletin_1_1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont = 0;

        do{
            System.out.println("dame un numero negativo\n");
        num = sc.nextInt();
        sc.nextLine();
        if (num >=0){
            cont ++;

        }

        }while ( num >= 0);

        System.out.println("has introducido" + " " + cont + " " + "numeros positivos");
    }
}

