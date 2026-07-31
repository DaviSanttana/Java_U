package Interfaces.Interfaces;

public class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void playVideo() {
        System.out.println("o computador esta reproduzindo o video");

    }

    @Override
    public void pauseVideo() {
        System.out.println("o computador esta pausando o video");

    }

    @Override
    public void stopVideo() {
        System.out.println("o computador esta parando o video");

    }

    @Override
    public void playMusic() {
        System.out.println("o computador esta Tocando a musica");

    }

    @Override
    public void pauseMusic() {
        System.out.println("o computador esta pausando a musica");

    }

    @Override
    public void stopMusic() {
        System.out.println("o computador esta parando a musica");

    }
}
