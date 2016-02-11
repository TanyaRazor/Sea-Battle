package com.mygdx.game;

/**
 * Created by tanya on 09.02.16.
 */
public class Computer extends Player {
    public Computer(){
        type = "Компьютер";
        enemyField = true;
        fieldType = "comp";
    }

    @Override
    public void fire(String field) {
        super.fire(field);
    }
}
