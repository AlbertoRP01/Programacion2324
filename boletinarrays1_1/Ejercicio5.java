package boletinarrays1_1;




public class Ejercicio5 {

    public static void main(String[] args) {
        GenerarArrayAleatorio(10);
    }

    public static void GenerarArrayAleatorio(int tamano) {
        int[] miarray = new int[tamano];
        for (int i = 0; i < tamano; i++){
            miarray[i]= (int)(Math.random() * 1000);
            System.out.println(miarray[i]);
        }
    }
}
