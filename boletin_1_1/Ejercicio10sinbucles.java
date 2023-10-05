package boletin_1_1;

public class Ejercicio10sinbucles {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }


    public static int factorial(int a) {

        if (a == 0 || a == 1) {

            return 1;
        }

        return a * factorial(a - 1);
    }

}
