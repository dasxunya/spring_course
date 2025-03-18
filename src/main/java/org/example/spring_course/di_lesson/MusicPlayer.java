package org.example.spring_course.di_lesson;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;

    //IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList.addAll(musicList);
    }

    public MusicPlayer() {
    }

    public void setMusic(List<Music> musicList) {
        this.musicList.addAll(musicList);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void playMusic() {
        this.musicList.forEach(music -> System.out.println(music.getSong()));
    }
}
