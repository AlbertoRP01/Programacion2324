package Boletin5_2_Ejercicio3;

public class MP3Player implements OnlineMusicPlayer, OfflineMusicPlayer{
    @Override
    public void play() {
        load();
        System.out.println("Playing music on MP3 Player");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music on MP3 Player");
    }

    @Override
    public void stream() {
        System.out.println("Streaming music on MP3 Player");
    }

    @Override
    public void load() {
        System.out.println("Loading music on MP3 Player");
    }
}
