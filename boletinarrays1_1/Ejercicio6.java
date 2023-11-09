package boletinarrays1_1;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numerobuscar = 7;

        int[] arrayvacio = devuelveArrayAleatorio();
        for (int i = 0; i < arrayvacio.length; i++) {

            if (arrayvacio[i] == numerobuscar) {
                System.out.printf("el numero que buscamos se encuentra en la posicion %d \n", i);
            }
        }
    }

    public static int[] devuelveArrayAleatorio() {
        int[] miarray = new int[5];
        for (int i = 0; i < miarray.length; i++) {
            miarray[i] = (int) (Math.random() * 10);
        }
        return miarray;
    }
}
