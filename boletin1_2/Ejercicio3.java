package boletin1_2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double matematicas, lengua, historia;

        System.out.println("Introduce 3 calificaciones de tus examenes ");

        matematicas = Double.parseDouble(sc.nextLine());
        lengua = Double.parseDouble(sc.nextLine());
        historia = Double.parseDouble(sc.nextLine());

        double resultado = matematicas + lengua + historia / 3;

        System.out.println("El resultado es " + resultado);
    }
}
