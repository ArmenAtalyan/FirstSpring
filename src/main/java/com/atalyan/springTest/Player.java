package com.atalyan.springTest;


import java.util.ArrayList;
import java.util.List;

public class Player {

    List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;


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

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic(){
            for(Music track : musicList){
                try {
                    System.out.println(track.getSong());
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){}
            }
    }
}
