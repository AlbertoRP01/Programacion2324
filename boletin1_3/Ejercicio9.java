package boletin1_3;


import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String tipoDeProducto;

        System.out.println("introduce el precio original del producto");
        double precioOriginal = Double.parseDouble(sc.nextLine());
        do {
            System.out.println("introduce un tipo de producto (A-B-C) ");
            tipoDeProducto = sc.nextLine();

        } while (!tipoDeProducto.equals("A") && !tipoDeProducto.equals("B") && !tipoDeProducto.equals("C"));

        if (tipoDeProducto.equals("A")) {
            double resultado = precioOriginal * 7 / 100;
            System.out.println("se le aplicara  en un 7 % a la cantidad: " + (resultado - precioOriginal));

        } else if (tipoDeProducto.equals("C") || precioOriginal < 500 ) {
            double resultado = precioOriginal * 12 /100;
            System.out.println("se le aplica en un 12% a la cantidad " + (resultado - precioOriginal));
        } else {
            double resultado = precioOriginal * 9 / 100;
            System.out.println("se le aplica en un 9% a la cantidad " + (precioOriginal - resultado));

        }
    }
}
