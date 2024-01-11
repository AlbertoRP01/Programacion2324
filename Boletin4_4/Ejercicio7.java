package Boletin4_4;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        desordenarCadena("cocacola");
    }

    public static void desordenarCadena(String cadena) {
        cadena = cadena.toLowerCase();
        StringBuilder cadenaVocales = new StringBuilder();
        StringBuilder cadenaConsonantes = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    cadenaVocales.append(cadena.charAt(i));
                    break;
                    default:
                    cadenaConsonantes.append(cadena.charAt(i));


            }
        }
        System.out.println(cadenaConsonantes.append(cadenaVocales));
    }
}
