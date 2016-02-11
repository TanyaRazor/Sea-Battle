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

    public String getTypeEnemy() {
        return typeEnemy;
    }

    protected String fieldType;
    //char[][] field;

    protected String typeEnemy;
    public String getType() {
        return typeEnemy;
    }

    public void fire(String field){
        System.out.println("Ход " + typeEnemy + ".\n");
        //if (!enemyField){
        /*if(field[selCellY][selCellX] == '*') {
            field[selCellY][selCellX] = 'X';
        }else{
            field[selCellY][selCellX] = 'o';
        }*/
            System.out.println("Огонь!!!!");
        //}




    }


}
