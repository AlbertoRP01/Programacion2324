package Boletin5_2_Ejercicio3;

public class ITunes implements OnlineMusicPlayer, OfflineMusicPlayer {
    @Override
    public void play() {
        load();
        System.out.println("Playing music on iTunes");

    }

    @Override
    public void stop() {
        System.out.println("Stopping Music on iTunes");
    }

    @Override
    public void stream() {
        System.out.println("Streaming Music on iTunes");
    }

    @Override
    public void load() {
        System.out.println("Loading music on iTunes");
    }

}
