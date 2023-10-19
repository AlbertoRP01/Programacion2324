package boletin1_4;


import ejemplosdeejercicios.MiEntradaSalida;

public class Ejercicio8 {

    public static void main(String[] args) {
      int a = MiEntradaSalida.leerEntero("introduce el coeficiente A");
      int b = MiEntradaSalida.leerEntero("Introduce el coeficiente B");
      int c = MiEntradaSalida.leerEntero("Introduce el coeficiente C");

      int discriminante = b * b -4 * a * c;
      if (discriminante > 0){
          System.out.println("hay dos soluciones reales");
      }
        if (discriminante <0){
            System.out.println("no hay solucion real");
        }
        if (discriminante ==0){
            System.out.println("no hay solucion real");
        }
        if (discriminante == 0){
            System.out.println("hay una solucion real");



        }
    }
}
