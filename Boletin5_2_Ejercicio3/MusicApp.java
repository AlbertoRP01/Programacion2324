package Boletin5_2_Ejercicio3;

public class MusicApp {

    public void starMusic(MusicPlayer[] players) {
        for (MusicPlayer p : players) {
            p.play();
            p.stop();


        }
    }

    public static void main(String[] args) {
        MusicPlayer[] players = new MusicPlayer[]{new Spotify(), new ITunes(), new MP3Player()};
        MusicApp app = new MusicApp();
        app.starMusic(players);
    }
}
