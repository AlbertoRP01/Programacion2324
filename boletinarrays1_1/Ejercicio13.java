package boletinarrays1_1;

import ejemplosdeejercicios.Main;

import java.util.Scanner;


public class Ejercicio13 {
    public static final int TAMANO_PILA = 10;
    public static final int[] pila = new int[TAMANO_PILA];
    public static int numeroElementos = 0;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("introduzca un numero a la pila");
        apilar();
        String respuesta;
        do{
            System.out.println("¿desea, apilar, desapilar o salir?");
            respuesta= sc.nextLine();
            if (respuesta.equals("apilar")){
                apilar();
            } else if (respuesta.equals("desapilar")){
                desapilar();
            }

        }while (!respuesta.equals("salir"));
    }

    public static void apilar() {

        if (numeroElementos == 10) {
            System.out.println("no se puede apilar has alcanzado el maximo");

        } else {

            System.out.println("introduce un numero");
            int numero = sc.nextInt();
            sc.nextLine();
            pila[numeroElementos] = numero;
            numeroElementos++;
            mostrar();
        }


    }

    public static void desapilar() {
        if (numeroElementos == 0) {
            System.out.println("no se puede desapilar");
        } else {
            numeroElementos--;
            mostrar();
        }

    }

    public static void mostrar() {
        System.out.println();
        for (int i = 0; i < numeroElementos; i++) {
            System.out.print(pila[i ]+ ", ");


        }
        System.out.println();
    }
}