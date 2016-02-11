package com.mygdx.game;

/**
 * Created by tanya on 09.02.16.
 */
public class Computer extends Player {
    public Computer(){
        typeEnemy = "Человек";
        enemyField = true;
        fieldType = "comp";
    }

    @Override
    public void fire(String field) {
        super.fire(field);
//        x=MainClass.rand.nextInt(Battleground.FIELD_SIZE);
//        y=rand.nextInt(Battleground.FIELD_SIZE);
    }
}
