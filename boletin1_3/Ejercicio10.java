package boletin1_3;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        String caracter = sc.nextLine();
        System.out.println("Dime dos numero enteros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean error;
        switch (caracter) {
            case "+":
                System.out.println("el resultado es: " + (num1 + num2));
                break;
            case "-":
                System.out.println("El resultado es: " + (num1 - num2));
                break;
            case "*":
                System.out.println("El resultado es " + (num1 * num2));

                break;
            case "/":
              if (num2 != 0) {
                  System.out.println("El resultado es " + (num1 / num2));
              }else {
                  System.out.println("no se puede dividir entre 0");
              }
                break;
            default:
               error = true;
                System.out.println("introduce un operador valido");

        }
        }

    }

