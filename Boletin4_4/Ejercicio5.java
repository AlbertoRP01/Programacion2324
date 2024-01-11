package Boletin4_4;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca una frase original");
        String frase = sc.nextLine();

        System.out.printf("Introduzca el texto a buscar");
        String palabra1 = sc.nextLine();

        System.out.printf("Introduzca el texto que reemplaza");
        String palabra2 = sc.nextLine();
        System.out.println("\n" + reemplazaExpresion(frase, palabra1, palabra2));
    }
    private  static  String reemplazaExpresion (String frase, String reemplazado, String reemplazador){
        StringBuilder str = new StringBuilder(frase);
        for (int i = frase.indexOf(reemplazado); i != -1; i += reemplazador.length()){
            i = str.indexOf(reemplazado, i);
            if (i!= -1){
                str.delete(i, i + reemplazado.length());
            }else {
                break;
            }
        }
        return  String.valueOf(str);
    }


}

