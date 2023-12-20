package Boletin4_4;

public class CadenaCaracteres {

    public static void main(String[] args) {
        String caracteres = "Hola mundo";
        char caracter = 'o';
        System.out.printf("En la cadena %s hay %d ocurrencias del caracter  %c ", caracteres, contarCaracteresEnCadena(caracteres, caracter), caracter);
    }

    public static int contarCaracteresEnCadena(String a, char o) {
        int cont = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == o) {
                cont++;
            }
        }
        return cont;
    }
}
