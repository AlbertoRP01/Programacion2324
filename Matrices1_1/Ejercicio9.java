package Matrices1_1;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5}, {1, 3, 5}};
        if (matrizEspejo(matriz)) {
            System.out.println(" Es simetrico");

        }else {
            System.out.println("No es simetrico");
        }
        Ejercicio3.linea(matriz);
    }

    public static boolean matrizEspejo(int[][] a) {
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length / 2; i++) {
                if (a[i][j] != a[a.length -1 -i][j]) {
                    return false;
                }
            }

        }
        return true;
    }
}
