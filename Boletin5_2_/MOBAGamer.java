package Boletin5_2_;

public class MOBAGamer  implements Gamer{
    public void ImprimirBattlelArena(){
       playGame();
    }

    @Override
    public void playGame() {
        System.out.println("Playing a Multiplayer OnlineBattle Arena Game");
    }
}
