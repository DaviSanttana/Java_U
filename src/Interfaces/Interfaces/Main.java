package Interfaces.Interfaces;

public class Main {
    static void main() {
        MusicPlayer musicPlayer = new Computer();
        runMusic(new Computer());
        runVideo(new Computer());

    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
