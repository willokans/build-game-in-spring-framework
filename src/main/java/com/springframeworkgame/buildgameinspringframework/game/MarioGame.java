package com.springframeworkgame.buildgameinspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
    @Override
    public void up(){
        System.out.println("Mario Up");
    }

    @Override
    public void down(){
        System.out.println("Mario Down");
    }

    @Override
    public void left(){
        System.out.println("Mario left");
    }

    @Override
    public void right(){
        System.out.println("Mario right");
    }
}
