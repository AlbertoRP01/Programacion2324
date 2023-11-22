package Matrices1_1;

public class Ejercicio6 {
<<<<<<< HEAD

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


=======
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5}, {0, 2, 7}};
        mostrarMatrizCI(matriz);
    }

    public static void mostrarMatrizCI(int[][] a) {
        for (int j = a[0].length - 1; j >= 0; j--) {

            for (int i = a.length - 1; i >= 0; i--) {
                System.out.print(a[i][j] + " ");
            }
        }

    }
}
>>>>>>> 430af85d10e20306535918554f78fb3de5695a8a
