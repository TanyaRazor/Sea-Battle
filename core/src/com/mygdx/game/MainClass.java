package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

public class MainClass extends ApplicationAdapter {
	SpriteBatch batch;
	BitmapFont fnt;
	GameField gf;
	GameField gf2;
	Player human;
	Player comp;
	public static Random rand = new Random();

	@Override
	public void create () {
		batch = new SpriteBatch();
		gf = new GameField(40, 30);
		gf2 = new GameField(430, 30);

		human = new Human();
		comp = new Computer();

		fnt = new BitmapFont(Gdx.files.internal("fnt2.fnt"), Gdx.files.internal("fnt2.png"), false);
	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(0.4f, 0.4f, 0.4f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		gf.render(batch, human);
		gf2.render(batch, comp);
		fnt.draw(batch, "Player",140, 370);
		fnt.draw(batch, "Computer",520, 370);
		fnt.draw(batch, gf.getSelCellCoords(), 30, 30);
		fnt.draw(batch, gf2.getSelCellCoords(), 430, 30);
		fnt.draw(batch, "Hint", InputHandler.getMouseX(), InputHandler.getMouseY() + 30);
		batch.end();
	}

	public void update() {

	}
}
