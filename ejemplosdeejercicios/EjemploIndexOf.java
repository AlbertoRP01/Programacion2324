package ejemplosdeejercicios;

public class EjemploIndexOf {

    public static void main(String[] args) {
        String a =  "voy a ver a mi abuela";

        int lastIndex = 0;
        int contador = 0;
        while (a.indexOf("a", lastIndex)!= -1){
            if (lastIndex == 0){
                contador++;
            }
            else {
                if (a.charAt(lastIndex -1)== ' ' ){


                }
            }
        }
    }


}
