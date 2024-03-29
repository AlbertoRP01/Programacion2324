package Boletin5_1_Ejercicio1;

import java.util.Scanner;

public class MenuCuentaCredito {

    public static void main(String[] args) {
        CuentaCredito cuenta = new CuentaCredito();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce la cantidad que quieres ingresar");
                    double dineroIngresar = sc.nextDouble();
                    try {
                        cuenta.ingresarDinero(dineroIngresar);
                    } catch (CuentaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Introduce la cantidad que quieres sacar");
                    double dineroSacar = sc.nextDouble();
                    try {
                        cuenta.sacarDinero(dineroSacar);
                    } catch (CuentaException | CuentaCreditoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(cuenta);
                    break;
                case 4:
                    System.out.println("adios");
            }


        } while (opcion != 4);

    }

    public static void menu() {
        System.out.println("Bienvenido a su cuenta. Seleccione una de estas opciones");
        System.out.println("1.Ingresar dinero");
        System.out.println("2. Sacar dinero");
        System.out.println("3. Mostrar saldo y credito");
        System.out.println("4.Salir");
    }
}
