package com.pong.gameobjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Carl on 12/03/2016.
 */
abstract public class GameObject
{
    protected Vector2 position;
    protected ShapeRenderer shape;
    protected float width, height;

    public GameObject()
    {
        position = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        shape = new ShapeRenderer();
        width = 0.0f;
        height = 0.0f;
    }

    abstract public void update();
    abstract public void render();
}
