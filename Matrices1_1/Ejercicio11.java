package Matrices1_1;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] matriz1 = {{7, 5, 3}, {8, 7, 1}};
        int[][] matriz2 = {{7, 5, 3}, {8, 7, 1}};

        if (comprobarInversa(matriz1 , matriz2)) {

            System.out.println("son inversa");

        } else
            System.out.println("No son inversa");
        }

        public static boolean comprobarInversa ( int[][] a, int[][] b){
            boolean comprobar = a.length == b.length;
            for (int i = 0; i < a.length && comprobar; i++) {
                comprobar = a[i].length == b[a.length - 1 - i].length;
                for (int j = 0; j < a[i].length && comprobar; j++) {
                    if (a[i][j] != b[a.length - 1 - i][a[i].length - 1 - j]) {
                        comprobar = false;
                    }
                }
            }
            return comprobar;
        }
    }
