package Boletin5_2_;

public class FPSGamer implements Gamer {
    public void  imprimirShooterGame(){
       playGame();
    }

    @Override
    public void playGame() {
        System.out.println("Playing a first person Shooter Game");
    }
}
