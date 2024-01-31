package Boletin4_4;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.println(esDireccionValida("http://www.marca2.es"));
    }

    public static boolean esDireccionValida(String direccion) {
        String comienzoCorrecto = "http://www";
        String[] direccionDividida = direccion.split("\\.");
        if (!direccion.startsWith(comienzoCorrecto)) {
            return false;
        }
        for (String s : direccionDividida) {

            if (direccionDividida.length != 3) {
                return false;
            }
            if (!comienzoCorrecto.equals(direccionDividida[0])) {
                return false;
            }
        }
        if (direccionDividida[1].contains(" ")) {

        }
        if (Character.isDigit(direccionDividida[1].charAt(0))) {
            return false;
        }
        if (direccionDividida[2].equals("es") && !direccionDividida[2].equals("com")) {

        }
        return true;
    }
}
