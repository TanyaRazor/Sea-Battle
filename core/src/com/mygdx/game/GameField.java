package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameField {

    private final int FIELD_SIZE = 10;
    private final int CELL_SIZE = 30;
    private final int FIELD_SIZE_PIXELS = FIELD_SIZE * CELL_SIZE;
    private static Texture fieldTexture;
    private static Texture aimTexture;
    private static Texture cellsTexture;

    private GameField plField;

    private int x;
    private int y;

    public int getSelCellX() {
        return selCellX;
    }

    public int getSelCellY() {
        return selCellY;
    }

    private int selCellX;
    private int selCellY;

    char[][] field;

    public GameField(int x, int y) {
        this.x = x;
        this.y = y;
        field = new char[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < 20; i++) {
            field[MainClass.rand.nextInt(FIELD_SIZE)][MainClass.rand.nextInt(FIELD_SIZE)] = '*';
        }
        fieldTexture = new Texture("FullWater.png");
        aimTexture = new Texture("pointer.tga");
        cellsTexture = new Texture("Cells.png");
    }

    public void render(SpriteBatch batch, Player pl) {
        update();
        batch.draw(fieldTexture, x, y);

        if (pl.getType() == "Человек") {

            for (int i = 0; i < FIELD_SIZE; i++) {
                for (int j = 0; j < FIELD_SIZE; j++) {
                    if (field[i][j] == '*')
                        batch.draw(cellsTexture, x + j * CELL_SIZE, y + i * CELL_SIZE, 0, 0, 30, 30);
                    if (field[i][j] == 'X')
                        batch.draw(cellsTexture, x + j * CELL_SIZE, y + i * CELL_SIZE, 30, 0, 30, 30);
                    if (field[i][j] == 'o')
                        batch.draw(cellsTexture, x + j * CELL_SIZE, y + i * CELL_SIZE, 60, 0, 30, 30);
                }
            }
        }else if(pl.getType() == "Компьютер"){

            for (int i = 0; i < FIELD_SIZE; i++) {
                for (int j = 0; j < FIELD_SIZE; j++) {
                    if (field[i][j] == '*')
                        batch.draw(cellsTexture, x + j * CELL_SIZE, y + i * CELL_SIZE, 0, 0, 30, 30);
                    if (field[i][j] == 'X')
                        batch.draw(cellsTexture, x + j * CELL_SIZE, y + i * CELL_SIZE, 30, 0, 30, 30);
                    if (field[i][j] == 'o')
                        batch.draw(cellsTexture, x + j * CELL_SIZE, y + i * CELL_SIZE, 60, 0, 30, 30);
                }
            }
        }

        //pl.fire(pl.getFieldType());
        if (pl.isEnemyField()){
            if(InputHandler.isClicked() && selCellY > -1 && selCellX > -1) {
                if(field[selCellY][selCellX] == '*') {
                    field[selCellY][selCellX] = 'X';
                }else{
                    field[selCellY][selCellX] = 'o';
                }
                pl.fire(pl.getFieldType());
            }
        }


        if(selCellX > -1 && selCellY > -1)
            batch.draw(aimTexture, x + selCellX * CELL_SIZE, y + selCellY * CELL_SIZE);
    }

    public void update() {
        selCellX = (InputHandler.getMouseX() - x) / CELL_SIZE;
        selCellY = (InputHandler.getMouseY() - y) / CELL_SIZE;
        if(InputHandler.getMouseX() < x || InputHandler.getMouseY() < y || InputHandler.getMouseX() >= x + FIELD_SIZE_PIXELS || InputHandler.getMouseY() >= y + FIELD_SIZE_PIXELS) {
            selCellX = -1;
            selCellY = -1;
        }
    }

    public String getSelCellCoords() {
        return "mouseCoords: " + (selCellX + 1) + " " + (selCellY + 1);
    }

}
