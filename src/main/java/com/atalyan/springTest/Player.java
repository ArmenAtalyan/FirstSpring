package com.atalyan.springTest;


import java.util.ArrayList;
import java.util.List;

public class Player {

    private Music music;
    private String name;
    private int volume;

    private List<Music> musicList = new ArrayList<>();

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
        musicList.add(music);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    Player(){}

    //Ioc
    public Player(Music music){
        this.music = music;
    }

    public void setMusic(Music music){
        this.music = music;
    }

    public void playAllMusic(){
        for(Music m : musicList) {
            System.out.println(m);
        }
    }
}
