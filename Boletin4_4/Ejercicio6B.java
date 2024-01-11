package Boletin4_4;

import java.util.Scanner;

public class Ejercicio6B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra");
        String palabra= sc.nextLine();

        System.out.printf("En la palabra %s hay %d volacales diferentes", palabra, contarVocalesDiferentes(palabra) );
    }
    public static  int contarVocalesDiferentes(String palabra){
        palabra = palabra.toLowerCase();
        int contador = 0;

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (char v : vocales){
            if (palabra.contains(v+"")) contador++;

        }
        return contador;
    }
}
