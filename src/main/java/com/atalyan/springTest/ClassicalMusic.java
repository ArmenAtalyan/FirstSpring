package com.atalyan.springTest;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic(){}
    @Override
    public String getSong() {
        return "Moon light";
    }
    public void doMyInit(){
        try {
             System.out.println("Initialization Classical bean.");
             Thread.sleep(1000);
        }
        catch (InterruptedException e){}
    }

    public void doMyDestroy(){
        try {
            System.out.println("Destroy Classical bean.");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){}
    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

}
