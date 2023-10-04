package ejemplosdeejercicios;

import java.util.Scanner;

public class ejercicio1 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce una palabra");
    String palabra1 = teclado.nextLine();
    System.out.println("Introduce la segunda palabra");
    String palabra2 = teclado.nextLine();
    System.out.println(palabra1 + " " + palabra2);
}
}
