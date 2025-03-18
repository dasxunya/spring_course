package org.example.spring_course.scope_lesson;

public class MusicPlayer {
    private Music music;
    private String name;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void playMusic() {
        System.out.println(music.getSong());
    }
}
