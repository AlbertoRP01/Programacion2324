package Boletin4_4;

public class Ejercicio7B {
    public static void main(String[] args) {
        desordenarCadena("masones");
        System.out.println("masones");
    }

    public static void desordenarCadena(String cadena) {
        cadena = cadena.toLowerCase();
        StringBuilder cadenasVocales = new StringBuilder();
        StringBuilder cadenasConsonantes = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cadenasVocales.append(cadena.charAt(i));
                    break;
                default:
                    cadenasConsonantes.append(cadena.charAt(i));
            }

        }

        System.out.println(cadenasConsonantes.append(cadenasVocales));
    }

    public static String desordenarCadena2(String cadena) {
        StringBuilder frase = new StringBuilder(cadena.toLowerCase().replaceAll("\\s+", ""));
        int cont = 0;
        for (int i = 0; cont < frase.length(); i++) {

            switch (frase.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    frase.append(frase.charAt(i));
                    frase.deleteCharAt(i);
                    i--;

            }
            cont++;
        }
        return frase.toString();
    }
}
