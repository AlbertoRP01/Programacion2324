package boletinarrays1_1;

public class Ejercicio8 {
    public static void main(String[] args) {
    int[] miarray=Ejercicio6.devuelveArrayAleatorio();
    int numeroabuscar = 5;
        System.out.println(posicionenArray(numeroabuscar, miarray));


    }
    public static int  posicionenArray(int numeroABuscar, int[] miarray) {

        for (int i = 0; i < miarray.length; i++) {
            if (miarray[i] == numeroABuscar) {
                return i;

            }

        }
        return -1;
    }
}
