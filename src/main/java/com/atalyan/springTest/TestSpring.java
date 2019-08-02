package com.atalyan.springTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Player player = context.getBean("player", Player.class);
        player.playMusic();
        context.close();
    }
}
