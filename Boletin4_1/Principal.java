package Boletin4_1;

import BoletinObjetos4_1.MiEntradaSalida;
import EjemploEduardo.ImprimirMenu;
import ejemplosdeejercicios.MiEntradaSalida;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldoInicial = MiEntradaSalida.LeerEnteroPositivo("Ingrese el saldo inicial en tu cuenta");
        Cuenta c = new Cuenta(saldoInicial);
        int opcion;
        do {

            opcion = MiEntradaSalida.leerEnteroDeRango("Introduce la operacion que le gustaria hacer ", 1, 4);
            imprimeMenu();
            switch (opcion) {
                case 1:
                    double cantidadRetirar = MiEntradaSalida.leerDouble("Introduce la cantidad que deseas retirar ");
                    c.hacerReintegro(cantidadRetirar);
                    break;
                case 2:
                    double cantidadIngresar = MiEntradaSalida.leerDouble("Introduce la cantidad que deseas ingresar ");
                    c.hacerIngreso(cantidadIngresar);
                    break;
                case 3:
                    c.ConsultarCuenta();
                    break;
                case 4:
                    char salir = MiEntradaSalida.leerSN("Deseas salir SI o NO");
                    if (salir == 'S') {
                        opcion = 5;
                        System.out.println("Saldo" + c.getSaldo());
                    }


            }

        } while (opcion != 5);

    }

    private static void imprimeMenu() {
        System.out.println("1. Hacer reintegro, se pedira la catidad o retirar ");
        System.out.println("2. Hacer un ingreso, se pedira la cantidad a ingresar ");
        System.out.println("3. Consultar el saldo y el  numero de reintegros o ingresos realizados. ");
        System.out.println("Finalizar ");
    }
}
