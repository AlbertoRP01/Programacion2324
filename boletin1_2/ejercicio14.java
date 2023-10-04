package boletin1_2;

import java.util.Scanner;

public class ejercicio14 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] agrs) {

        System.out.println("Introduce el primer numero");

        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el segundo numero");

        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce la operacion");
        String operacion = sc.nextLine();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicar = num1 * num2;
        int dividir = num1 / num2;


        switch (operacion) {
            case "suma":
                System.out.println("La respuesta es " + "+ " + num2 + "=" + suma);
                break;

            case "resta":
                System.out.println("la respuesta es " + "-" + num2 + "=" + resta);
                break;

            case "multiplicar":
                System.out.println("la respuesta es " + "*" + num2 + "=" + multiplicar);
                break;

            case "Dividir":
                System.out.println(" la respuesta es " + "/" + num2 + "=" + dividir);
                break;
        }
    }
}
