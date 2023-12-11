
package boletin1_7;


import BoletinObjetos4_1.MiEntradaSalida;

public class Ejercicio2 {


    public static void main(String[] args) {
        int num = MiEntradaSalida.LeerEnteroPositivo("introduce los numeros positivos");


        int inverso = reverse(num);
        if (inverso == num) {
            System.out.println("es capicua ");

        } else {
            System.out.println("no es capicua");
        }
    }


    public static int reverse(int num) {
        int inverso = 0;
        while (num  != 0) {
            inverso = inverso * 10 + num % 10;
            num /= 10;
        }
        return inverso;
    }

}


