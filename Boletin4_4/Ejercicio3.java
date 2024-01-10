package Boletin4_4;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String cadena = sc.nextLine();
        if (esPalindromo(cadena)){
            System.out.println("La frase es palíndroma");

        }else {
            System.out.println("La frase no es plíndroma");
        }
    }
    public static boolean esPalindromo(String cadena){
        cadena = cadena.replaceAll("\\s+",  "").toLowerCase(Locale.ROOT);
        for (int i = 0; i < cadena.length() / 2; i++){
            if (cadena.charAt(i) != cadena.charAt(cadena.length() -i -1)){
                return false;
            }
        }
        return true;
    }

}
