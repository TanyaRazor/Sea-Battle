package com.mygdx.game;

/**
 * Created by tanya on 07.02.16.
 */
public class Player {
    public boolean isEnemyField() {
        return enemyField;
    }

    protected boolean enemyField;

    public String getFieldType() {
        return fieldType;
    }

    protected String fieldType;
    char[][] field;

    protected String type;
    public String getType() {
        return type;
    }

    public void fire(String field){
        //if (!enemyField){
            System.out.println("Огонь!!!!");
        //}




    }


}
