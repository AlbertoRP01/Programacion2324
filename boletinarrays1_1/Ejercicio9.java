package boletinarrays1_1;

import java.util.Arrays;
import java.util.FormatterClosedException;

public class Ejercicio9 {
    public static void main(String[] args) {
        String orden = "menor";
        int[] element= Ejercicio6.devuelveArrayAleatorio();
        int[]ordenado= ordenarArray(element, orden);
        System.out.println(Arrays.toString(ordenado));
    }

    public static int[] ordenarArray(int[] miarray, String ordenar) {
        int almacen = 0;
        if (ordenar.equals("mayor")) {
            for (int i = 0; i < miarray.length; i++) {


                for (int j = 0; j < miarray.length - 1; j++) {
                    if (miarray[j] < miarray[j + 1]) {


                        almacen = miarray[j];
                        miarray[j] = miarray[j + 1];
                        miarray[j + 1] = almacen;
                    }
                }
            }
        }else {
            Arrays.sort(miarray);
        }
        return miarray;
    }
}
