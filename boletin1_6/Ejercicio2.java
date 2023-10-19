package boletin1_6;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int exponente;
        do {

            System.out.println("Introduce un numero");
            base = Integer.parseInt(sc.nextLine());
            System.out.println("Introduce el segundo numero");
            exponente = Integer.parseInt(sc.nextLine());
        }while (base < 0 || exponente < 0) ;

               double resultado = Math.pow(base, exponente);


            System.out.println("El resultado es " + resultado);
        }
    }


