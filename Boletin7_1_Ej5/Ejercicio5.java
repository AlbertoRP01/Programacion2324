package Boletin7_1_Ej5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.IllegalFormatCodePointException;

public class Ejercicio5 {
    public static void main(String[] args) {
        int opcion;
        do {
            menu();
            opcion = MiEntadaSalida.leerEnteroDeRango("Elija una opcion", 1, 5);
            switch (opcion) {
                case 1:
                    crearDirectorio();
                    break;
                case 2:
                    crearFichero();
                    break;
            }
        } while (opcion != 5);
    }

    public static void menu() {
        System.out.println("1. Crear directorio");
        System.out.println("2. Crear fichero de texto");
        System.out.println("3. Borrar fichero ");
        System.out.println("4. Mostrar Carpeta");
        System.out.println("5. Salir");
    }

    public static void crearDirectorio() {
        String nombre = MiEntadaSalida.leerCadena("Diga el nombre del directorio");
        File directorio = new File("./Boletin7_1_Ej5" + nombre);
        if (directorio.exists()) {
            System.out.println("El directorio ya existe");
        } else {
            if (directorio.mkdir()) {
                System.out.println("El directorio se ha creado correctamente");
            } else {
                System.out.println("El directorio no ha podido ser creado");
            }
        }
    }

    public static void crearFichero() {
        String nombre = MiEntadaSalida.leerCadena("Elija el nombre del fichero");
        File ficheroTexto = new File("\\Boletin7_1_Ej5\\2" + nombre);
        boolean append = true;
        if (ficheroTexto.exists()) {
            if (ficheroTexto.isFile()) {
                append = MiEntadaSalida.leerSN("¿Quiere añadir el contenido al final del fichero?") == 's';
            }
        } else {
            System.out.println("El fichero no ha podido crearse, porque ya existe un fichero  un directorio con el mismo  directorio ");
            return;
        }
        String cadena = MiEntadaSalida.leerCadena("Escriba la cadena que estará en el fichero");
        try (PrintWriter pw = new PrintWriter(new FileWriter(ficheroTexto, append))) {

            pw.println(cadena);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
