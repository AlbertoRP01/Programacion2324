package ejemplosdeejercicios;

import java.util.Scanner;

public class ejerciciofor {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i < 11; i++) {
            suma += i;
        }
        System.out.println(suma);

    }
}
