package com.atalyan.springTest;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

    public void doMyInit(){

        try {
            System.out.println("Initialization Jazz bean.");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){}
    }

    public void doMyDestroy(){
        try {
            System.out.println("Destroy Jazz bean.");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){}
    }
    @Override
    public String getSong() {
        return "Summer Time";
    }
}
