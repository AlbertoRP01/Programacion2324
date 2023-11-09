package boletinarrays1_1;

public class Ejercicio2 {
    public static void main(String[] args) {
        int negativos = 0;
        int[] miarray = {1, 5, 9, 22, 15, -17, 16, -64};

        for (int i = 0; i < miarray.length; i++) {


            if (miarray[i] < 0) {
                negativos++;
            }
        }

            System.out.println("los numeros negativos son " + negativos);

    }
}
