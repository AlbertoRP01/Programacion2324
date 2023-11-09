package boletin1_2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el grado celius");
        double gradosCelsius = Double.parseDouble(sc.nextLine());
  double gradosF = (gradosCelsius * 9 / 5) +32;


        System.out.println("Los grados celsius es "  + gradosCelsius);
        System.out.println(" Los grados  Farennheit " + gradosF);
    }
}
