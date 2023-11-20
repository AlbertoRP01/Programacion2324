package boletinarrays1_1;

import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {
        int[] arrayA = Ejercicio6.devuelveArrayAleatorio();
        arrayA = Ejercicio9.ordenarArray(arrayA, "menor");

        int[] arrayB = borrarElementoDuplicado(arrayA);
        System.out.println(Arrays.toString(arrayB));
    }

    public static int[] borrarElementoDuplicado(int[] miarray) {

        int tamanoNuevo = miarray.length;
        for (int i = 1 ; i < miarray.length; i++) {
            if (miarray[i] == miarray[i - 1]) {
                tamanoNuevo--;


            }

        }
        int[] limpiarArray = new int[tamanoNuevo];
        int contador = 1;
        limpiarArray[0] = miarray[0];
        for (int i = 1; i < miarray.length; i++) {
            if (miarray[i] != miarray[i - 1]) {
                limpiarArray[contador] = miarray[i];
                contador++;
            }
        }
        return limpiarArray;
    }

}