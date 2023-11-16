package Matrices1_1;

public class Ejercicio3 {
    public static void main(String[] args) {

        int[][] matriz = {{3, 7, -3}, {4, 7, 9}};

        linea(matriz);
    }

    public static void linea (int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
        }

    }


}
