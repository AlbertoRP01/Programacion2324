package BoletinObjetos4_1;

import ejemplosdeejercicios.MiEntradaSalida;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class PrincipalMaquina {
    public static void main(String[] args) {
        int opcionEscogida;
        Maquina maq = new Maquina();

        do {
            mostrarMenu();
            opcionEscogida = MiEntradaSalida.leerEnteroDeRango("Seleccione una opcion ", 1, 5);

            switch (opcionEscogida) {
                case 1:
                    if (maq.puedoServirCafe()) {
                        double pago = MiEntradaSalida.leerDouble("Introduce el pago");
                        try {
                            System.out.println(maq.darCambio(pago, Maquina.PRECIO_CAFE));
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("producto agotado");
                    }
                    break;
                case 2:
                    if (maq.puedoServirLeche()) {
                        double pago = MiEntradaSalida.leerDouble("Introduce el pago");
                        try {
                            System.out.println(maq.darCambio(pago, Maquina.PRECIO_LECHE));
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("producto agotado");
                    }
                    break;
                case 3:
                    if (maq.puedoServirCafeLeche()) {
                        double pago = MiEntradaSalida.leerDouble("Introduce el pago");
                        try {
                            System.out.println(maq.darCambio(pago, Maquina.PRECIO_CAFE_LECHE));
                        } catch (MaquinaException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("producto agotado");
                    }
                    break;
                case 4:
                    System.out.println(maq);
                    break;
                case 5:
                    System.out.println("Gracias por su compra, vuelve a visitarnos");
            }

        } while (opcionEscogida != 5);
    }

    public static void mostrarMenu() {
        System.out.println("Bienvenido a la maquina de café, elije una de las siguientes opcione");
        System.out.println("1. Servir café " + Maquina.PRECIO_CAFE + " € ");
        System.out.println("2. servir leche " + Maquina.PRECIO_LECHE + " € ");
        System.out.println("3. Servir cafe con leche " + Maquina.PRECIO_CAFE_LECHE + " € ");
        System.out.println("4. Consultar la maquina ");
        System.out.println(" 5. Salir ");
    }
}
