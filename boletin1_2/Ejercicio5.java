package boletin1_2;

import java.util.Scanner;

public class Ejercicio5 {
    static int oro = 300;
    static String arma;
    static int nivel = 30;

    static double salud = 150;
    static int danoRecibido;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el daño recibido");
        int dano = Integer.parseInt(sc.nextLine());
        int actualiza = (int)salud - dano;

        System.out.println(" Estado del inventario actual tienes: oro:%d2  arma: %d2 " + actualiza);

    }
}
