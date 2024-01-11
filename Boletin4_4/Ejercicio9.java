package Boletin4_4;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String cadena = sc.nextLine();
        System.out.println(contarCaracteres(cadena));
    }
    public static  int contarCaracteres(String cadena){
        int almacenarNumerosEnteros= 0;
        int acumulador = 0;
        for (int i = 0; i < cadena.length(); i++){
            if (Character.isDigit(cadena.charAt(i))){
                almacenarNumerosEnteros= almacenarNumerosEnteros * 10 + Integer.parseInt(cadena.charAt(i) + "");

            }else {

                if (almacenarNumerosEnteros > 0){
                    acumulador += almacenarNumerosEnteros;
                    almacenarNumerosEnteros = 0;
                }
            }
        }
        return acumulador + almacenarNumerosEnteros;
    }
}

