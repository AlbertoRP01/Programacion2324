package boletin1_7;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Introduce los siguientes numeros");
            int num = Integer.parseInt(sc.nextLine());
            int inverso = 0;
        while (num !=0){
                inverso = inverso * 10 + num % 10;
                num /=10;
            }
            System.out.println(inverso);


    }
}
