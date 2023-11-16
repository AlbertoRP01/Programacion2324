package boletinarrays1_1;


import ejemplosdeejercicios.MiEntradaSalida;

import java.util.Arrays;

public class Ejercicio13 {

    public static final int TAM_PILA = 5;
    public static final int[] pila = new int[TAM_PILA];

    public static int ultimoElemento = 0;

    public static void main(String[] args) {
        int opcion = 0;

        while (opcion != 3) {
            menu();
            opcion = MiEntradaSalida.leerEnteroDeRango("Introduce una opción", 1, 3);

            switch (opcion) {
                case 1 -> {
                    int num = MiEntradaSalida.leerEntero("Introduce un número");
                    apilar(num);
                }
                case 2 -> {
                    int numDesapilado = desapilar();
                    System.out.println("Has desapilado el número " + numDesapilado);
                }
                case 3 -> System.out.println("Adiós");
                default -> System.out.println("Elige una opción válida");
            }
        }
    }
    public static void menu() {
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1) Apilar");
        System.out.println("2) Desapilar");
        System.out.println("3) Salir");
    }
    public static void mostrar(){

        System.out.println(Arrays.toString(pila));
    }
    public static void apilar(int num) {
        int ultimoElemento = 0;
        if (ultimoElemento != pila.length) {
            pila[ultimoElemento] = num;
            ultimoElemento++;

        } else {
            System.out.println("No hay espacio. Libere en caso de que quieras agregar otro valor");
        }

    }
    private static int desapilar() {
        int ultimoElemento = 0;
        if (ultimoElemento == 0) {
            System.out.println("nohay nada que desapialr");
        }else {
            ultimoElemento--;
        }
        return pila[ultimoElemento];
    }



}
