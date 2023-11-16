package boletinarrays1_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3};
        int[] arrayB = {1,2,4};

        int[] arrayc = borrarElementoDuplicado(arrayA, arrayB);
        System.out.println(Arrays.toString(arrayB));
    }

    public static int[] añadirduplicados(int[] a1, int[] a2) {
        int[] a3 = new int[a2.length];
        int elementoasAnadidos = 0;
        for (int i = 0; i < a2.length; i++) {
            if (indexOf(a1, a2[i]) == -1) {

                a3[elementoasAnadidos++] = a2[i];
            }
        }
        return a3;
    }

    public static int[] borrarElementoDuplicado(int[] miarray, int[] miarray2) {
        int[] a3 = new int[miarray2.length];
        int elementosanadidos = 0;
        for (int i = 1; i < miarray2.length; i++) {
            if (indexOf(miarray, miarray2[i]) != -1) {
                a3[elementosanadidos++] = miarray2[i];


            }

        }


        int[] a4 = new int[elementosanadidos];
        for (int i = 0; i < elementosanadidos; i++) {
            a4[i] = a3[i];
        }
        return a4;
    }

    public static int indexOf(int[] a, int tamano) {
        int pos = -1;
        for (int i = 0; i < a.length && pos == -1; i++) {
            if (a[i] == tamano) {
                pos = 1;
            }
        }
        return pos;
    }

}

