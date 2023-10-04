package ejemplosdeejercicios;

import java.util.Scanner;

public class Dowhile {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] agrs) {

        String contrasena;


        do {
            System.out.println(" Introduce una contraseña de mas de 8 o mas caracteres ");

            contrasena = sc.nextLine();


        } while (contrasena.length() < 8);


        System.out.println(" contraseña correcta ");
        sc.close();
    }
}
