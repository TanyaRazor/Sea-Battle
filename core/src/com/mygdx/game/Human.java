package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.utils.reflect.Field;

/**
 * Created by tanya on 09.02.16.
 */
public class Human extends Player {
    public Human(){
        type = "Человек";
        fieldType = "human";
        enemyField = false;
    }

    @Override
    public void fire(String field) {
        super.fire(field);
        /*if(InputHandler.isClicked() && field.getSelCellY() > -1 && field.getSelCellX() > -1) {
            if (this.field[field.getSelCellY()][field.getSelCellX()] == '*') {
                this.field[field.getSelCellY()][field.getSelCellX()] = 'X';
            }
        }*/
    }
}
