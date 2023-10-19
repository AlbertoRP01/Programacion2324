/*package Relacion1_1;

import java.util.Scanner;

public class Ejercicio7 {
    static double RENTENCION_SOLTERO_DIVORCIADO = 12;
    static double RENTENCION_MAYORES_50 = 8.5;
    static double RENTENCION_VIUDOS_CASADOS = 11.3;
    static double RETENCION_RESTO = 10.5;
    static final int PRIMERA_FRANJA_EDAD = 35;

    static final int SEGUNDA_FRANJA_EDAD = 50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("introduce el estado civil (s-soltero, casado, v-viudo y D-divorciado");
            char estado = sc.nextLine().charAt();
        }while ();
        do {
            System.out.println("Introduce la edad");
            int edad = Integer.parseInt(sc.nextLine());
        } while ();

        if ((estado == 's' || estado == 'D') && edad < 35) {
            System.out.println("su porcentaje de retencion es de " + RETENCION_SOLTERO_DIVORCIADO + '%');

        } else if (edad > 50) {
            System.out.println("su porcentaje de retencion es de un 12%" + RENTENCION_MAYORES_50 + '%');

        } else if ((estado == 'v' || estado == 'c') && edad < 35) {
            System.out.println("su porcentaje de retencion de un 8.5% " + RENTENCION_VIUDOS_CASADOS + '%');

        }
    }
}*/
