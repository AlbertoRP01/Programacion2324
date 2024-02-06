package Boletin5_2_;

public class SportsGamer implements Gamer {
    public void imprimirSportsGame() {
        playGame();
    }

    @Override
    public void playGame() {
        System.out.println("Playing a Sports Game");
    }
}
