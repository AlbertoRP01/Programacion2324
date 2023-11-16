package Matrices1_1;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2}, {3, 4}};
        int resultado = sumaMatriz(matriz);
        System.out.println("El resultado de la suma de la matriz es " + resultado);
    }

    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma = suma + matriz[i][j];


            }
        }
        return suma;
    }
}
