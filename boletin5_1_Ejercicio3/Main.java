package boletin5_1_Ejercicio3;

public class Main {
    public static void main(String[] args) {


        try {
            Mago magoA = new Mago("manolo", Raza.ENANO, 16, 12, 21);
            Mago magoB = new Mago("Jaimito", Raza.ELFO, 12, 16, 19);
            Clerigo clerigoC = new Clerigo("Angel", Raza.HUMANO, 17, 14, 21, "Zeus");
            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);
            magoA.aprenderHechizo("bola de fuego");
            magoA.aprenderHechizo("trueno del dragon");
            magoB.aprenderHechizo("sombras de marwal");

            System.out.println(magoA);
            System.out.println(magoB);

            magoA.lanzaHechizo(magoB, "bola de fuego");

            System.out.println(magoA);
            System.out.println(magoB);
            System.out.println(clerigoC);

        } catch (PersonajeException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
