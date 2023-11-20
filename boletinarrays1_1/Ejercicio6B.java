package boletinarrays1_1;

import java.util.Arrays;

public class Ejercicio6B {
    public static void main(String[] args) {
        int numerobuscar = 7;

        int[] arrayvacio = devuelveArrayAleatorio();
        if (encontrarElemento(numerobuscar, arrayvacio)){
            System.out.println("El numero se encuentra dentro del array");

        }else{
            System.out.println("El numero no se encuentra dentro del array");

        }
        System.out.println(Arrays.toString(arrayvacio));
    }

    public static boolean encontrarElemento(int buscar, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == buscar) {
                return true;

            }
        }
        return false;
    }

    public static int[] devuelveArrayAleatorio() {
        int[] miarray = new int[5];
        for (int i = 0; i < miarray.length; i++) {
            miarray[i] = (int) (Math.random() * 10);
        }
        return miarray;
    }
}