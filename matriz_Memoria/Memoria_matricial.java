package matriz_Memoria;


import java.util.Scanner;

public class Memoria_matricial {
    public static final int TAM = 4;  //Queremos saber el tamaño de nuestras matrices
    public static final int INTENTOS = 5; //son el numero de intentos  que vamos a tener cuando fallemos
    public static final char OCULTO = '#'; // Vamos utilzar este caracter para ocultar la primera matriz que es la que contiene las letras


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char[][] matriz = new char[TAM][TAM]; // creamos nuestro array de dos dimensiones con char para que que contenga en vez de numeros sino letras
        boolean[][] matrizVisible = new boolean[TAM][TAM];// creamos esta otra matriz para ocultar con los caracteres # que contiene la   costante oculto
        ocultarTodaLaMatriz(matrizVisible);//  llamamos al metodo ocultar matriz para que al ejecutar te muestre al principio  del  array con los simbolos #


        fillMatrix(matriz); //Llamamos al metodo fill matrix para que nos rellene con A nuestras celdas de la primera matriz
        randomizeMatrix(matriz); // En este metodo que llamamos se mueven de manera aleatoria nuetras filas y columnas de nuestra matriz que contiene valores  A
        printMatrix(matriz);

        int intentosRestantes = INTENTOS; // Estamos diciendo que los intentos restantes es el numero de veces que puedes fallar
        // TODO: Aplicar la lógica descrita del juego
        while (INTENTOS > 0 && checkFinished(matrizVisible)) {  //Una vez que ejecutemos el programa las vidas que le quedan al usuario y que la matriz no este visible por completo
            System.out.println("tienes " + INTENTOS + " Intentos " + " te quedan  " + intentosRestantes + " Intentos ");
            printVisibleMatrix(matriz, matrizVisible);//Llamamos el metodo imprimir la matriz visible Te muestra en pantalla  ambas matrices
            System.out.println(" tienes " + intentosRestantes + " Intentos ");// Te dice los intentos que tienes o te quedan
            System.out.println(" que fila quieres revelar: (0-3) " + " ");// le decimos la coordenada al usuario que elija
            int fila1 = sc.nextInt();// responde el usuario  introduciendo el numero de la fila que quiere revelar
            System.out.println(" que columna quieres revelar: (0-3) " + " ");// Le pide al usuario la columna que quiere que revele
            int columna1 = sc.nextInt();// el ususario tiene que introducir el numero de la columna que quiere revelar
            if (fila1 > 3) {
                System.out.println(" introduce de nuevo ");// es un mensaje de error y quiere  que el usuario vuelva a introducir de nuevo la fila que quieres revelar
                continue;// En el caso de que introduzca mas del numero exigido de columnas o filas que tengas que volver a introducir las filas y las columnas
            }
            if (columna1 > 3) {
                System.out.println(" Introduce de nuevo ");
                continue;
            }

            if (!matrizVisible[fila1][columna1]) {// Si en la coordenada que ha selecciona el usuario en esa casilla que es oculta es visible
                matrizVisible[fila1][columna1] = true;// entonces te devuelve verdadero en este caso la casilla es visible

            } else {

                System.out.println(" Esa casilla ya existe ");// en el caso de que no te muestra un mensaje que ya existo
            }

            int fila2;
            int columna2;
            printVisibleMatrix(matriz, matrizVisible);//muesta por
            System.out.println(" tienes " + intentosRestantes + "intentos");
            System.out.println(" que fila quieres revelar: (0-3) ");// Le dicemos al usuario que cordenada quiere que vaya
            fila2 = sc.nextInt();
            System.out.println(" que columna quieres revelar: (0-3) ");
            columna2 = sc.nextInt();
            if (fila2 > 3) {
                System.out.println(" introduce de nuevo ");// Si falla le decimos al usuario que introduzca de nuevo la coordenada
                continue;// te lleva de nuevo  a que te pregunte la  coordenada que quieres introducir
            }
            if (columna2 > 3) { // si la coordenada que introduces es mayor de la maxima que pide
                System.out.println(" Introduce de nuevo ");//entonces tienes que volver a introducir la coordenada
                continue;// y te lleva de nuevo a que le pida al usuario que introduzca dicha coordenada
            }

            if (!matrizVisible[fila1][columna1]) {// Si la coordenada seleccionada por usuario que esta oculta se le revelara
                matrizVisible[fila1][columna1] = true;

            } else {

                System.out.println("Esa casilla ya existe ");// si no cumple entonces te muestra el mensaje de que existe
            }

            if (matrizVisible[fila2][columna2]) {
                System.out.println(" existe ");
                matrizVisible[fila1][columna1] = false;
            } else {

                matrizVisible[fila2][columna2] = true;
                printVisibleMatrix(matriz, matrizVisible);
            }

            if (matriz[fila1][columna1] == matriz[fila2][columna2]) {// en el caso de que haga que de que las casillas del usuario a pedido las letras las encuentra iguales
                System.out.println("Has acertado maquina ");// entonces acertastes
            } else {
                System.out.println("has fallado :( ");// y si no las encuentras iguoles fallastes
                matrizVisible[fila1][columna1] = false;// cuando falla el usuario la celda se oculta
                matrizVisible[fila2][columna2] = false;// cunado falla el usuario la celda se oculta
                intentosRestantes--;// cuando falla el  acumulador se encarga de  resta 1 de vida
            }


        }

        if (checkFinished(matrizVisible)) {// comprueba si el usuario a ganado o no ha ganado y si gana te muestra el mensaje
            System.out.println("¡Enhorabuena! Has ganado");// te muestra el mensaje de que has ganado
        } else {// en el caso de que no  ganes te mostrara un mensaje que vuelvas a jugar de nuevo cuando pierdes todas las vidas
            System.out.println("¡Vaya! Has perdido. Vuelve a jugar otra vez.");// el mensaje que te muestra cuando pierdes
        }
    }

    /**
     * Imprime la matriz por pantalla
     *
     * @param matriz
     */
    private static void printMatrix(char[][] matriz) {// te muestra la matriz
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println();
        }
        System.out.println();
    }

    /**
     * Imprime la matriz visible por pantalla, mostrando las celdas ocultas con el valor de la constante OCULTO
     *
     * @param matriz
     * @param matrizVisible
     */
    private static void printVisibleMatrix(char[][] matriz, boolean[][] matrizVisible) {//   te muestra la matriz una vez que interactue con el usuario
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matrizVisible[i][j]) {// si es matriz es visible te mostrara la matriz


                    System.out.print(matriz[i][j] + " ");

                } else {//en el caso de que no te mostrara la matriz oculta

                    System.out.print(OCULTO + " ");
                }
            }
            System.out.println();


        }
        System.out.println();
    }

    /**
     * Rellena la matriz con los valores de la A a la letra final (que vendrá determinada por A + TAM * TAM / 2) dos veces
     *
     * @param matriz
     */
    public static void fillMatrix(char[][] matriz) {//Este metodo lo que quiere es rellenar la matriz de letras
        int letras = 65;// es la posicion donde se situan las letras mayusculas de este modo podemos introducir las letras en la matriz como valor
        for (int i = 0; i < (matriz.length / 2); i++) {// en este bucle for repasamos per la mitad del array para que de esta manera rellene la fila entera y cuando llegue a la otra mitad se rellena igual que la primera
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (char) letras;// aqui lo decimos que la matriz que contiene valores numerales los transformamos en letras
                letras++;// incrementamos 1 a la posicion para pasar de letra por ejemplo de A a B de esta forma no rellena siempre A todas las casillas

            }


        }
        letras = 65;// hacemos lo mismo
        for (int i = matriz.length / 2; i < matriz.length; i++) {//repasamos el array como en el anterior porque es la segunda parte del array de las filas que empieza desde el final de  la primera parte del array

            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] = (char) letras;
                letras++;

            }


        }


    }


    private static void randomizeMatrix(char[][] matriz) {// este metodo consta de que las filas y las columnas se mueva de manera aleatoria
        // Una vez rellena la matriz, la desordenamos
        int columnAleatorio;// creamos una variable llamada columna aleatoria
        int filAleatoria;// creamos una variable llamada columna aleatoria
        char almacenTemporal;// almacenamos la matriz en esta variable

        for (int i = 0; i < matriz.length; i++) {// repasamos la matriz

            for (int j = 0; j < matriz[0].length; j++) {// aqui igual
                filAleatoria = (int) (Math.random() * matriz.length);// decimos que en la matriz la fila se mueva de manera aleatoria pero no el contenido
                columnAleatorio = (int) (Math.random() * matriz[0].length);// con las columnas es lo mismo las movemos de manera aleatoria pero no su contenido
                almacenTemporal = matriz[i][j];// guardamos la matriz
                matriz[i][j] = matriz[filAleatoria][columnAleatorio];// y que la matriz contenga filas y columnas aleatorias
                matriz[filAleatoria][columnAleatorio] = almacenTemporal;// y la guardamos durante un tiempo que necesite el programa para que se mueva las columnas y filas de la matriz
            }


        }

    }


    private static void ocultarTodaLaMatriz(boolean[][] matrizVisible) {// este metodo lo que hace es ocultar las celdas de la matriz

        for (int i = 0; i < matrizVisible.length; i++) {
            for (int j = 0; j < matrizVisible.length; j++) {
                matrizVisible[i][j] = false;// de esta manera hacemos que para que se oculten tiene que ser falso siempre para cuando inicies te aparezca la tabla con las celdas ocultas

            }


        }


    }


    private static boolean checkFinished(boolean[][] matrizVisible) {
        boolean celdasVisibles = true;// decimos que quen en caso de que las celdas visibles
        for (int i = 0; i < matrizVisible.length; i++) {//repasamos el array
            for (int j = 0; j < matrizVisible[0].length; j++) {
                if (matrizVisible[i][j] = false) {// decimos en el caso de que en el juego fallas  la celda que esta visible
                    celdasVisibles = false;// entonces  las celdas se ocutan de nuevo en el caso de que sea falso o sea si fallas
                }
            }
        }

        return celdasVisibles;
    }
}

