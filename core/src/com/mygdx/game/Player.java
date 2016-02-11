package com.mygdx.game;

/**
 * Created by tanya on 07.02.16.
 */
public class Player {
    GameField gameField;

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
    char[][] field;

    protected String typeEnemy;
    public String getType() {
        return typeEnemy;
    }

    public void fire(String field){
        System.out.println("Ход " + typeEnemy + ".");

            /*if(this.field[gameField.getSelCellY()][gameField.getSelCellX()] == '*') {
                this.field[gameField.getSelCellY()][gameField.getSelCellX()] = 'X';
            }else{
                this.field[gameField.getSelCellY()][gameField.getSelCellY()] = 'o';
            }*/
                System.out.println("Огонь!!!!\n");





    }


}
