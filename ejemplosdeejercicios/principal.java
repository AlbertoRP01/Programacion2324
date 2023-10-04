package ejemplosdeejercicios;

import java.util.Scanner;
public class principal {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Introduce el tipo de vehículo");
      String tipoVehiculo = sc.nextLine();

      if (tipoVehiculo.equals("coche")) {

         System.out.println("velocidad = 120km/h");

      }

      if (tipoVehiculo.equals("moto")) {
         System.out.println("velocidad = 90km/h");
      }

      if (tipoVehiculo.equals("camion")) {
         System.out.println("velocidad = 80/km");
      } else {

         System.out.println("no existe este vehiculo");

      }
   }
}


