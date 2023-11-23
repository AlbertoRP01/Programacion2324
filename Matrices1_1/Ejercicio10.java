package Matrices1_1;

public class Ejercicio10 {
    public static void main(String[] args) {

        int[][] matriz = {{1, 5, 3}, {5, 8, 3}};
        int[][] matriz2 = {{1, 5, 3}, {5, 8, 3}};

        System.out.println("matriz 1:");
        System.out.println(matrizSimetrica(matriz));
        System.out.println("matriz 2: ");
        System.out.println(matrizSimetrica(matriz2));
    }

    public static boolean matrizSimetrica(int[][] a) {
        boolean simetrica = true;
        int filas = a.length;
        int columnas = a[0].length;
        for (int j = 0; simetrica && j < columnas / 2; j++) {


            for (int i = 0; simetrica && i < filas; i++) {

                if (a[i][j] != a[i][columnas - 1 - j]) {
                    simetrica = false;
                }

            }
        }
        return simetrica;
    }


    int[][] matriz = {{1, 3, 1}, {1, 3, 1}};
        if(

    matrizEspejo(matriz))

    {
        System.out.println(" Es simetrico");

    }else

    {
        System.out.println("No es simetrico");
    }
        Ejercicio3.linea(matriz);
}

    public static boolean matrizEspejo(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length / 2; j++) {
                if (a[i][j] != a[i][a[0].length - 1 - j]) {
                    return false;
                }
            }

        }
        return true;
    }

