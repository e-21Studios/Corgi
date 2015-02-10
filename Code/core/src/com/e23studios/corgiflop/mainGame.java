package com.e23studios.corgiflop;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class mainGame extends ApplicationAdapter {
    private OrthographicCamera camera;
    private SpriteBatch batch;
    private Corgi corgi;

	
	@Override
	public void create () {
        camera = new OrthographicCamera(1080, 1920);
        batch = new SpriteBatch();
        corgi = new Corgi();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        corgi.getSprite().draw(batch);
        batch.end();
	}
}
