package Boletin4_4;

import java.util.Scanner;


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String cadena = sc.nextLine();
        sc.close();
        System.out.println(contarPalabras(cadena));

    }

    public static int contarPalabras(String cadena) {

        return cadena.isBlank() ? 0 :cadena.trim().split("\\s+").length;

    }
}
