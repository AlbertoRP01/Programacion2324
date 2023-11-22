package Matrices1_1;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 5}, {1, 3, 5}};
        if (matrizEspejo(matriz)) {
            System.out.println(" Es simetrico");

<<<<<<< HEAD
        } else {
=======
        }else {
>>>>>>> 430af85d10e20306535918554f78fb3de5695a8a
            System.out.println("No es simetrico");
        }
        Ejercicio3.linea(matriz);
    }

    public static boolean matrizEspejo(int[][] a) {
        for (int j = 0; j < a[0].length; j++) {
            for (int i = 0; i < a.length / 2; i++) {
<<<<<<< HEAD
                if (a[i][j] != a[a.length - 1 - i][j]) {
=======
                if (a[i][j] != a[a.length -1 -i][j]) {
>>>>>>> 430af85d10e20306535918554f78fb3de5695a8a
                    return false;
                }
            }

        }
        return true;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 430af85d10e20306535918554f78fb3de5695a8a
