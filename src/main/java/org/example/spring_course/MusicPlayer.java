package org.example.spring_course;

public class MusicPlayer {
    private Music music;
    private String name;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void playMusic() {
        System.out.println("Playing music: " + music.getSong());
    }
}
