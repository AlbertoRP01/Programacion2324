package EjemploEduardo;

import ejemplosdeejercicios.MiEntradaSalida;

public class ImprimirMenu {


    public static void imprimirMenu() {
        int opcion;
        do {

            opcion = MiEntradaSalida.leerEnteroDeRango("Introduce la operacion que le gustaria hacer ", 1, 4);
            switch (opcion) {
                case 1:
                    double cantidadRetirar = MiEntradaSalida.leerDouble("Introduce la cantidad que deseas retirar ");
                    c.hacerReintegro(cantidadRetirar);
                case 2:
                    double cantidadIngresar = MiEntradaSalida.leerDouble("Introduce la cantidad que deseas ingresar ");
                    c.hacerIngreso(cantidadIngresar);
                case 3:
                    c.ConsultarCuenta();
                    break;
                case 4:
                    char salir = MiEntradaSalida.leerSN("Deseas salir SI o NO");
                    if (salir == 'S') {
                        opcion = 5;
                        System.out.println("Saldo" + c.getSaldo());
                    }
                    while (opcion != 5) ;



            }


    }


}
