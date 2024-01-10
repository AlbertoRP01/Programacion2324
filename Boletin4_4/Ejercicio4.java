package Boletin4_4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        System.out.println(" Introduce la palabra escondida");
        String palabraEscondida = sc.nextLine();

        if (encuentraPalabras(frase, palabraEscondida)) {
            System.out.println("Encontrada");
        } else {
            System.out.println("No encontrada");
        }

    }


    public static boolean encuentraPalabras(String frase, String palabraEscondida) {
        int contPalabraEncontrada = 0;
        frase = frase.toLowerCase();
        palabraEscondida = palabraEscondida.toLowerCase();
        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == palabraEscondida.charAt(contPalabraEncontrada)) {
                contPalabraEncontrada++;

            }
            if (contPalabraEncontrada == palabraEscondida.length()) {
                break;
            }
        }
        return contPalabraEncontrada == palabraEscondida.length();
    }
}
