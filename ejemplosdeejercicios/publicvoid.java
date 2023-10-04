package ejemplosdeejercicios;

import java.util.Scanner;

public class publicvoid {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] agrs) {

        saluda();
        saluda("pepe");
        saluda(55);
        int a = 33;
        saluda(a);
        saluda(suma(a, 9));
    }

    public static int suma(int a, int b){
        return a +  b;

    }
    private static void saluda() {
    }

    public static void saluda(String nombre) {
        System.out.println(" hola mundo " + nombre);
    }

    public static void saluda(int a) {
        System.out.println(" numero " + a);
    }
}

