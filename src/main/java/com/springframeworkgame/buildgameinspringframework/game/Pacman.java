package com.springframeworkgame.buildgameinspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pacman implements GamingConsole {

    @Override
    public void up(){
        System.out.println("Pacman Up!");
    }

    @Override
    public void down(){
        System.out.println("Pacman down!");
    }

    @Override
    public void right(){
        System.out.println("Pacman right!");
    }

    @Override
    public void left(){
        System.out.println("Pacman left!");
    }
}
