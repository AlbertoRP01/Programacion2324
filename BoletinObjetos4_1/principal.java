package BoletinObjetos4_1;

import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int saldoInicial = MiEntradaSalida.LeerEnteroPositivo("Ingrese el saldo inicial en tu cuenta");
        Cuenta c = new Cuenta(saldoInicial);
        do {
        imprimeMenu();
        switch (opcion){
            case 1:
                double cantidadRetirar = MiEntradaSalida.leerDouble("Introduce la cantidad que desas reitar");
                c.
        }
        }while (opcion !=4);

        }
        public static void imprimeMenu(){
            System.out.println("1. Hacer reintegro, se pedira la catidad o retirar ");
            System.out.println("2. Hacer un ingreso, se pedira la cantidad a ingresar ");
            System.out.println("3. Consultar el saldo y el  numero de reintegros o ingresos realizados. ");
            System.out.println("Finalizar ");
    }
}
