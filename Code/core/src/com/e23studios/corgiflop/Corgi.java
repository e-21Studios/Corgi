package com.e23studios.corgiflop;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.Gdx;
/**
 * Created by Will on 06/02/2015.
 */
public class Corgi {

    private Texture texture;
    private Sprite sprite;

    public Corgi() {
        texture = new Texture(Gdx.files.internal("defaultCorgi.png"));
        sprite = new Sprite(texture);
    }

    public Corgi(String customSpriteSheet) {
        texture = new Texture(Gdx.files.internal(customSpriteSheet));
        sprite = new Sprite(texture);
    }

    public Sprite getSprite() {
        return sprite;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setSpriteSheet(String newTexture) {
        texture = new Texture(Gdx.files.internal(newTexture));
        sprite = new Sprite(texture);
    }

}
