package com.springframeworkgame.buildgameinspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole{

    @Autowired
    public void up(){
        System.out.println("SC Up");
    }

    @Autowired
    public void down(){
        System.out.println("SC Down");
    }

    @Autowired
    public void left(){
        System.out.println("SC left");
    }

    @Autowired
    public void right(){
        System.out.println("SC right");
    }
}
