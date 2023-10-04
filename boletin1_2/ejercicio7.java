package boletin1_2;

import java.util.Scanner;

public class ejercicio7 {
    public static void main (String[] agrs) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce el tipo de pokemon");
        String tipoPokemon = sc.nextLine();


        if(tipoPokemon.equals("fuego")){

            System.out.println("has elegido a charmander");
        }

        if (tipoPokemon.equals("agua")){

            System.out.println("has elegido a squirtle");

        }
        if (tipoPokemon.equals("planta")){

            System.out.println("Has elegido a bulbasaur");
        }

        else {
            System.out.println("No existe este tipo de pokemon");
        }
    }
}

