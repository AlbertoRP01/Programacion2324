package boletinarrays1_1;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] miarray = Ejercicio6.devuelveArrayAleatorio();
        int numeroabuscar = 5;
        if (buscarEnArray(numeroabuscar, miarray)) {
            System.out.printf("El array tiene el elemento buscado %d \n", numeroabuscar);
        } else {
            System.out.println("no se encuentra el elemento");
        }

    }

    public static boolean buscarEnArray(int numeroABuscar, int[] miarray) {

        for (int i = 0; i < miarray.length; i++) {
            if (miarray[i] == numeroABuscar) {
                return true;

            }

        }
        return false;
    }
}
