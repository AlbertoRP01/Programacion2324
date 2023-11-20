package boletinarrays1_1;

import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] ArrayA = Ejercicio6.devuelveArrayAleatorio();
        int[] ArrayB = Ejercicio6.devuelveArrayAleatorio();
        int[] ArrayA2 = Ejercicio9.ordenarArray(ArrayA, "menor");
        int[] ArrayB2 = Ejercicio9.ordenarArray(ArrayB, "menor");
        int[] ArrayA3 = Ejercicio10.borrarElementoDuplicado(ArrayA2);
        int[] ArrayB3 = Ejercicio10.borrarElementoDuplicado(ArrayB2);
        int[] ArraySuma = mantenerElementoDuplicado(ArrayA3, ArrayB3);
        System.out.println(Arrays.toString(ArrayA3));
        System.out.println(Arrays.toString(ArrayB2));
        System.out.println(Arrays.toString(ArraySuma));

    }

    public static int[] mantenerElementoDuplicado(int[] miarray, int[] miArray2) {
        int tamanoNuevo = miarray.length + miArray2.length;
        int[] ArrayTemporal = new int[tamanoNuevo];
        int contador = 0;

        for (int i = 0; i < miarray.length; i++) {
            ArrayTemporal[contador] = miarray[i];
            contador++;

        }
        for (int i = 0; i < miArray2.length; i++) {
            ArrayTemporal[contador] = miArray2[i];
            contador++;
        }
        int[] ArrayTemporal2 = Ejercicio9.ordenarArray(ArrayTemporal, "menor");
        int contador2 = ArrayTemporal2.length - 1;
        for (int i = 1; i < ArrayTemporal2.length; i++) {

            if (ArrayTemporal2[i] != ArrayTemporal2[i - 1]) {
                contador2--;
            }
        }
        int[] ArrayFinal = new int[contador2];
        int contador3 = 0;
        for (int i = 1; i < ArrayTemporal2.length; i++) {
            if (ArrayTemporal2[i] == ArrayTemporal2[i - 1]) {
                ArrayFinal[contador3] = ArrayTemporal2[i];
                contador3++;

            }
        }
        return ArrayFinal;

    }
}
