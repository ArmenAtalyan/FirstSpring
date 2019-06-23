package com.atalyan.springTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Music music = context.getBean("musicBean", Music.class);
        Player player = context.getBean("player", Player.class);
        player.playAllMusic();
//        System.out.println(player.getName());
//        System.out.println(player.getVolume());
        context.close();
    }
}
