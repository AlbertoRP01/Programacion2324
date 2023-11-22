package Matrices1_1;


public class Ejercicio7 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5}, {0, 2, 7}};
        int[][] matriz2 = {{1, 3, 5}, {0, 2, 7}};
        if (matricesIguales(matriz, matriz2)) {
            System.out.println("son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }

    public static boolean matricesIguales(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {


            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

