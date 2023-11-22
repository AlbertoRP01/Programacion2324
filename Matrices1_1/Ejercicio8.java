package Matrices1_1;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5}, {0, 2, 7}};
        int[][] matriz2 = {{1, 3, 5}, {0, 2, 7}};
<<<<<<< HEAD
        int[][] matrizSuma = sumarMatrices(matriz, matriz2);
        Ejercicio3.linea(matrizSuma);
=======
        int[][] matrizSuma = sumarMatrices(matriz , matriz2);
            Ejercicio3.linea(matrizSuma);
>>>>>>> 430af85d10e20306535918554f78fb3de5695a8a
    }

    public static int[][] sumarMatrices(int[][] a, int[][] b) {
        int[][] matrizResultado = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
<<<<<<< HEAD
            for (int j = 0; j < a[0].length; j++) {
                matrizResultado[i][j] = a[i][j] + b[i][j];
=======
            for (int j = 0; j < a[0].length; j++ ){
                matrizResultado[i][j]=  a[i][j] +  b[i][j];
>>>>>>> 430af85d10e20306535918554f78fb3de5695a8a

            }
        }
        return matrizResultado;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 430af85d10e20306535918554f78fb3de5695a8a
