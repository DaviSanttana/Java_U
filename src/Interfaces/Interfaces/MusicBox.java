package Interfaces.Interfaces;

public class MusicBox implements MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("o caixa de musica esta Tocando a musica");

    }

    @Override
    public void pauseMusic() {
        System.out.println("o caixa de musica esta pausando a musica");

    }

    @Override
    public void stopMusic() {
        System.out.println("o caixa de musica esta parando a musica");

    }
}
