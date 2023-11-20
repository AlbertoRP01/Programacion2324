package boletinarrays1_1;

import java.util.Arrays;

public class Ejercicio12 {


    public static void main(String[] args) {
        int[] almacen = Ejercicio6.devuelveArrayAleatorio();
        System.out.println(Arrays.toString(almacen));
         OrdenarArrayBurbuja(almacen);
        System.out.println(Arrays.toString(almacen));

    }

    public static void OrdenarArrayBurbuja(int[] miArrayBurbuja) {
        int almacenar;
        for (int i = 0; i < miArrayBurbuja.length -1; i++) {

            for (int j = 1; j < miArrayBurbuja.length -i; j++) {
                if (miArrayBurbuja[j] < miArrayBurbuja[j - 1]) {
                almacenar= miArrayBurbuja[j];
                miArrayBurbuja[j]= miArrayBurbuja[j -1];
                miArrayBurbuja[j-1]=almacenar;

                }
            }
        }
    }
}
