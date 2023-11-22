package Matrices1_1;

public class Ejercicio6 {

    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5}, {0, 2, 7}};
        leerMatrizPorInverso(matriz);
    }

    public static void leerMatrizPorInverso(int[][] a) {
        System.out.println("la saluda es ");
        for (int j = a[0].length - 1; j >= 0; j--) {
            for (int i = a.length -1; i >=0; i--){
                System.out.println(a[i][j] + " ");
            }
        }
    }
}


