/*
package boletin1_7;

import ejemplosdeejercicios.MiEntradaSalida;

import java.util.Scanner;


public class Ejercicio3 {

    public static final int M_VALUE = 1000;
    public static final int D_VALUE = 500;
    public static final int C_VALUE = 100;
    public static final int L_VALUE = 50;
    public static final int X_VALUE = 10;
    public static final int V_VALUE = 5;
    public static final int I_VALUE = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero romano");
        String numRomano = sc.nextLine();


        int valorDecimal = 0;
        int lastDigitValue = 0;
        for (int i = 0; i < numRomano.length();i++) {
            char digit = numRomano.toUpperCase().charAt(i);
            int digitValue = valueOf(digit);

            if (i == 0) {
                valorDecimal = digitValue;


                continue;
            } else {
                if (lastDigitValue >= digitValue) {
                    valorDecimal += digitValue;
                    lastDigitValue = digitValue;
                } else {
                    valorDecimal = lastDigitValue+ digitValue - (2 * lastDigitValue);
                }
            }

        }

        System.out.println("El valor de &S es %d" numRomano, valorDecimal);

    }

    public static valueOf(char c) {
        return switch (c)
        {
            case 'M'
                yield M_VALUE;
            case 'D'
                yield D_VALUE;
            case 'c'
                yield C_VALUE;
            case 'L'
                yield L_VALUE;
            case 'X'
                yield X_VALUE;
            case 'v'
                yield V_VALUE;
            case 'I' yield I_VALUE;
            default: yield  -1;
        };

    }
}
*/
