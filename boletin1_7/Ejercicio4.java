package boletin1_7;


public class Ejercicio4 {
    public static void main(String[] args) {




        int hora = MiEntradaSalida.leerEnteroDeRango("Introduce las horas que suman", 0,23);
        int min = MiEntradaSalida.leerEnteroDeRango("Introduce los minutos que se suman ", 0, 59);
        int seg = MiEntradaSalida.leerEnteroDeRango("Introduce los segundos que se suman", 0, 59);

        int hora2 = MiEntradaSalida.leerEnteroDeRango("Introduce las horas que se suman ", 0, 23);
        int min2= MiEntradaSalida.leerEnteroDeRango("Introduce los minutos que se suman", 0, 59);
        int seg2 = MiEntradaSalida.leerEnteroDeRango("Introduce los segundos que se suman", 0, 59);
        hora = hora + hora2;
        min = min +min2;
        seg = seg + seg2;

        while (seg > 59){
           min = min +1;
           seg = seg -60;

        }
        while (min > 59){
            hora = hora +1;
            min = min -60;

        }
        if  (hora > 23){
            while (hora > 23){
                hora = hora -24;
            }
            System.out.println("la hora es " +hora + ":" + min + ":"+seg+ "(del dia siguiente)");

        }
        else {
            System.out.println("la hora es " + hora+ ":" + min + ":"+seg);
        }

    }
}
