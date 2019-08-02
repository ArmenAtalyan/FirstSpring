package com.atalyan.springTest;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music {

    public void doMyInit(){

        try {
            System.out.println("Initialization Pop bean.");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){}
    }

    public void doMyDestroy(){

        try {
            System.out.println("Destroy Pop bean.");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){}

    }
    @Override
    public String getSong() {
        return "In the club";
    }
}
