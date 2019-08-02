package com.atalyan.springTest;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {

    public void doMyInit(){

        try {
            System.out.println("Initialization Rock bean.");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){}
    }

    public void doMyDestroy(){
        try {
            System.out.println("Destroy Rock bean.");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){}
    }

    @Override
    public String getSong() {
        return "Wind of change";
    }
}
