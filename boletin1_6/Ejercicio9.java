package boletin1_6;

public class Ejercicio9 {
    public static void main(String[] args) {

        int tabla = 0;
        int num = 0;
        for (int i = 1; i <=10; i++){
            num++;
            tabla ++;
            System.out.println("la tabla " +tabla);

            for (int j = 1; j <=10; j++ ){
                int resultado = num * j;
                System.out.println(num+ " * " +j+ " = " + resultado);
            }
        }
    }
}
