package ejemplosdeejercicios;

import java.util.Scanner;

public class MiEntradaSalida {

    public static Scanner sc = new Scanner(System.in);

    public static int solicitarEntero(String mensaje) {
        // Variable que almacenará el entero introducido por teclado.
        int integer = 0;
        // Variable que almacenará un booleano que indicará si se le debe volver a pedir el dato al usuario.
        boolean flag = true;

        while (flag) {
            // Pedimos el entero por pantalla.
            System.out.println(mensaje);
            // Comprobamos si el usuario está introduciendo algo correcto usando la excepción del método parseInt.
            try {
                integer = Integer.parseInt(sc.nextLine());
                // Si llegamos hasta aquí, es porque el usuario ha introducido un dato correcto y no se ha lanzado ninguna excepción.
                flag = false;
            }
            // Si se lanza la excepción, informamos al usuario de su error.
            catch (NumberFormatException e) {
                System.out.println("Ha introducido un dato incorrecto.");
            }

        }

        return integer;
    }
    public static double solicitarDouble(String mensaje) {
        // Variable que almacenará el entero introducido por teclado.
        double decimal = 0;
        // Variable que almacenará un booleano que indicará si se le debe volver a pedir el dato al usuario.
        boolean flag = true;

        while (flag) {
            // Pedimos el  decimal por pantalla.
            System.out.println(mensaje);
            // Comprobamos si el usuario está introduciendo algo correcto usando la excepción del método parseDouble.
            try {
                decimal = Double.parseDouble(sc.nextLine());
                // Si llegamos hasta aquí, es porque el usuario ha introducido un dato correcto y no se ha lanzado ninguna excepción.
                flag = false;
            }
            // Si se lanza la excepción, informamos al usuario de su error.
            catch (NumberFormatException e) {
                System.out.println("Ha introducido un dato incorrecto.");
            }

        }

        return decimal;
    }

    public static int solicitarEnteroPositivo(String mensaje) {
        // Variable que almacenará el entero introducido por teclado.
        int integer = 0;
        // Variable que almacenará un booleano que indicará si se le debe volver a pedir el dato al usuario.
        boolean flag = true;

        while (flag) {
            // Pedimos el entero por pantalla.
            System.out.println(mensaje);
            // Comprobamos si el usuario está introduciendo algo correcto usando la excepción del método parseInt.
            try {
                integer = Integer.parseInt(sc.nextLine());
                // Si llegamos hasta aquí, es porque el usuario ha introducido un dato correcto y no se ha lanzado ninguna excepción.
                if (integer >= 0) {
                    flag = false;
                }
            }
            // Si se lanza la excepción, informamos al usuario de su error.
            catch (NumberFormatException e) {
                System.out.println("Ha introducido un dato incorrecto.");
            }

        }

        return integer;
    }

    public static int solicitarEnteroEnRango(String mensaje, int limiteInferior, int limiteSuperior) {
        // Variable que almacenará el entero introducido por teclado.
        int integer = 0;
        // Variable que almacenará un booleano que indicará si se le debe volver a pedir el dato al usuario.
        boolean flag = true;

        while (flag) {
            // Pedimos el entero por pantalla.
            System.out.println(mensaje);
            // Comprobamos si el usuario está introduciendo algo correcto usando la excepción del método parseInt.
            try {
                integer = Integer.parseInt(sc.nextLine());
                // Si llegamos hasta aquí, es porque el usuario ha introducido un dato correcto y no se ha lanzado ninguna excepción.
                if (integer >= limiteInferior && integer <= limiteSuperior) {
                    flag = false;
                }
            }
            // Si se lanza la excepción, informamos al usuario de su error.
            catch (NumberFormatException e) {
                System.out.println("Ha introducido un dato incorrecto.");
            }

        }

        return integer;
    }

    public static char solicitarCaracter(String mensaje) {
        char c = '0';

        // Variable que almacenará un booleano que indicará si se le debe volver a pedir el dato al usuario.
        boolean flag = true;

        while (flag) {
            // Pedimos el entero por pantalla.
            System.out.println(mensaje);
            // Comprobamos si el usuario está introduciendo algo correcto usando la excepción del método parseInt.
            try {
                c = sc.nextLine().charAt(0);
                // Si llegamos hasta aquí, es porque el usuario ha introducido un dato correcto y no se ha lanzado ninguna excepción.
                flag = false;
            }
            // Si se lanza la excepción, informamos al usuario de su error.
            catch (IndexOutOfBoundsException e) {
                System.out.println("Ha introducido un dato incorrecto.");
            }

        }

        return c;
    }


    public static char solicitarCaracterSN(String mensaje) {
        char c = '0';

        // Variable que almacenará un booleano que indicará si se le debe volver a pedir el dato al usuario.
        boolean flag = true;

        while (flag) {
            // Pedimos el entero por pantalla.
            System.out.println(mensaje);
            // Comprobamos si el usuario está introduciendo algo correcto usando la excepción del método parseInt.

            String cadena = sc.nextLine();

            if (cadena.length() == 1) {
                c = cadena.toUpperCase().charAt(0);

                if (c == 'S' || c == 'N') {
                    // Si llegamos hasta aquí, es porque el usuario ha introducido un dato correcto y no se ha lanzado ninguna excepción.
                    flag = false;
                }
            }
        }

        return c;
    }

    public static String solicitarCadena(String mensaje) {
        String cadena = "";

        // Variable que almacenará un booleano que indicará si se le debe volver a pedir el dato al usuario.
        boolean flag = true;

        while (flag) {
            // Pedimos el string por pantalla.
            System.out.println(mensaje);
            // Comprobamos si el usuario está introduciendo algo correcto usando la excepción del método parseInt.

            cadena = sc.nextLine();

            if (cadena.length() > 0) {
                // Si llegamos hasta aquí, es porque el usuario ha introducido un dato correcto y no se ha lanzado ninguna excepción.
                flag = false;
            }
        }

        return cadena;
    }

    public static int leerEntero(String mensaje) {
        System.out.printf(mensaje + ": ");

        //TODO Controlar excepción
        return Integer.parseInt(sc.nextLine());
    }

    public static double leerDouble(String mensaje) {

        double res = 0;
        boolean ok = false;

        do {
            System.out.println(mensaje);
            try {
                res = Double.parseDouble(sc.nextLine());
                ok = true;
            } catch (NumberFormatException e) {
                System.out.println("Tienes que introducir un número");
            }

        } while (!ok);

        return res;
    }

    /**
     * Lee un entero y comprueba si es positivo
     * @param mensaje lee el mensaje que ha insertado el usuario

     * @return devuelve un valor positivo
     */
    public static int LeerEnteroPositivo(String mensaje){
        //if (positivo < 0){
        //TODO Controlar excepcion
        // }

        System.out.printf(mensaje + ": ");

        int numeroLeido;

        do {
            numeroLeido = Integer.parseInt(sc.nextLine());

            if (numeroLeido< 0){
                System.out.println("Introduce un número positivo");
            }
        } while (numeroLeido < 0);

        return numeroLeido;
    }

    /**
     * Lee un entero comprendido entre el mínimo y el máximo (incluidos)
     * @param min Valor mínimo aceptado
     * @param max Valor máximo aceptado
     * @return Devuelve un valor entre el mínimo y máximo
     */
    public static int leerEnteroDeRango(String mensaje, int min, int max){
        if (min >= max){
            // TODO: Hacer cuando conozcamos las excepciones
        }

        System.out.printf(mensaje + ": ");

        int numeroLeido;
        do {
            numeroLeido = Integer.parseInt(sc.nextLine());

            if (numeroLeido < min || numeroLeido > max){
                System.out.printf("Porfavor introduce un valor entre %d y %d", min, max);
            }
        } while (numeroLeido < min || numeroLeido > max);

        return numeroLeido;
    }

    public static char leerSN(String mensaje){
        System.out.printf(mensaje + ": ");

        char sn;

        do {
            sn = sc.nextLine().toUpperCase().charAt(0);
        }while (sn != 'S' && sn != 'N');

        return sn;
    }

    public static void cerrarScanner(){
        sc.close();
    }
}


