
package Boletin5_1_Ejercicio2;

import ejemplosdeejercicios.MiEntradaSalida;

import java.util.Scanner;

public class MenuVehiculo {
    /*
    private static final int MAX_VEHICULOS = 200;
    private static final Vehiculo[] ListaVehiculos = new Vehiculo[MAX_VEHICULOS];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            imprimirMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;
            }
        } while (opcion != 4);
    }

    private static void imprimirMenu() {
        System.out.println("Escoge una opcion: ");
        System.out.println("1. Seleccione el tipo de Vehiculo");
        System.out.println("2. ");
    }

    private void darAltaVehiculo() {
        int seleccionUsuario;
        System.out.println("Estos son los vehiculos disponibles ");
        int opcion = 1;
        for (TipoVehiculo t : TipoVehiculo.values()) {
            System.out.println(" "+ ++opcion + ". " + String.valueOf(t).toLowerCase());
            System.out.println(t);
        }
        seleccionUsuario = MiEntradaSalida.leerEnteroDeRango("Seleccion",TipoVehiculo.values().length, 1 );

    }
    private static void  calculoPrecio() {
        int posVehiculo;

        String matricula = MiEntradaSalida.solicitarCadena("Introduzca la matricula del vehículo");
        int dias = MiEntradaSalida.leerEnteroDeRango("Introduce el numero de dias alquilado", 1, 365);

        for (posVehiculo = 0; posVehiculo < vehiculosAlta; posVehiculo++) {

        }
        if (ListaVehiculos[posVehiculo].getMatricula().equals(matricula)) break;
    }

    if(posVehiculo != vehiculosAlta){
        System.out.println("""
                El vehiculo seleccionado con matricula: %s 
                y tras ser usado por %d días; 
                conlleva un precio total de %.2f€ 
                """,matricula, dias, ListaVehiculos[posVehiculos].getPrecioAlquiler(dias));
    }
*/
}
