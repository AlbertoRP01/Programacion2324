package Boletin5_2_Ejercicio3;

public class Spotify implements OnlineMusicPlayer, OfflineMusicPlayer {
    @Override
    public void play() {
        load();
        System.out.println("Playing music on Spotify");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on Spotify");
    }

    @Override
    public void stream() {
        System.out.println("Streaming music on Spotify");
    }

    @Override
    public void load() {
        System.out.println("Loading music on Spotify");
    }

}
