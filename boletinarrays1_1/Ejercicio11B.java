package boletinarrays1_1;

import java.util.Arrays;

public class Ejercicio11B {
    public static void main(String[] args) {
        int[] ArrayA = Ejercicio10.borrarElementoDuplicado(Ejercicio9.ordenarArray(Ejercicio6.devuelveArrayAleatorio(), "menor"));
        int[] ArrayB = Ejercicio10.borrarElementoDuplicado(Ejercicio9.ordenarArray(Ejercicio6.devuelveArrayAleatorio(), "menor"));
        int[] ArraySuma = mantenerElementoDuplicado(ArrayA, ArrayB);
        System.out.println(Arrays.toString(ArrayA));
        System.out.println(Arrays.toString(ArrayB));
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
