package com.atalyan.springTest;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic(){}
    @Override
    public String getSong() {
        return "Moon light";
    }
    public void doInit(){
        System.out.println("Do my initialization.");
    }
    public void doDestroy(){
        System.out.println("Do my destruction.");
    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

}
