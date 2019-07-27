package com.atalyan.springTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("rockMusic", Music.class);
        Player player = new Player(music);
        player.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);
        Player player2 = new Player(music2);
        player2.playMusic();
        context.close();
    }
}
