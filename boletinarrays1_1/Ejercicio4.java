package boletinarrays1_1;

import java.util.Random;

public class Ejercicio4 {

    public static final int NUM_REPETICIONES = 6000;
    public static final int MIN_RANDOM = 0;
    public static final int MAX_RANDOM = 100;

    public static void main(String[] args) {

        Random rnd = new Random();

        int suma = 0;

        //crea un array de 10 posiciones para guardar cuantas veces se repiute los últimos numeros
        int[] terminaciones = new int[10];

        //creacion de los 6000 números aleatorios
        for (int i = 0; i < NUM_REPETICIONES; i++) {
            int aleatorio = rnd.nextInt(MAX_RANDOM);
            suma += aleatorio;
            //suma el último dígito y lo añade a la posicion del array
            terminaciones[aleatorio % 10]++;


        }

        int posMax = 0;
        int maxvalue = Integer.MIN_VALUE;

        //Este for voy a mostrar el número de veces que se ha repetido el ultimo dígito

        for (int i = 0; i < terminaciones.length; i++) {
            System.out.printf("El numero %d se ha repetido %d veces. esto equivale a un %.2f%%\n ", i, terminaciones[i], (double) terminaciones[i] / NUM_REPETICIONES * 100);

        }

        //En este for busco el dígito en el que gan terminado más numeros

        for (int i = 0; i < terminaciones.length; i++) {
            if (terminaciones[i] > maxvalue) {
                maxvalue = terminaciones[i];
            }
        }
        /*
        si un número se repite el maximo número de veces vuelve a recorrer el array por si otro
        se ha repetido el maximo número de veces
         */
        for (int i = 0; i < terminaciones.length; i++) {
            if (terminaciones[i] == maxvalue) {
                System.out.printf("El digito %d es el que más numeros han terminado (%d veces)\n", i, maxvalue);
            }
        }
        System.out.printf("La media de los numeros es %.2f\n", (double) suma / NUM_REPETICIONES);

        //Este for sirve para comprobar que un número no se haya repetido
        for (int i = 0; i < terminaciones.length; i++){
            if (terminaciones[i]==0){
                System.out.printf("No ha habído ningún número que terminase en &d\n ",i);
            }
        }
    }
}
