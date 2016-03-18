package com.pong.gameobjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

import java.awt.Rectangle;

/**
 * Created by Carl on 12/03/2016.
 */
abstract public class GameObject
{
    protected Vector2 position;
    protected ShapeRenderer shape;
    protected float width, halfWidth, height, halfHeight;

    public GameObject()
    {
        position = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        shape = new ShapeRenderer();
        width = 0.0f;
        halfWidth = 0.0f;
        height = 0.0f;
        halfHeight = 0.0f;
    }

    public abstract void update();
    public abstract void render();

    public Vector2 getPosition() { return position; }
    public float getWidth() { return width; }

    public void setPosition(Vector2 position)
    {
        this.position.x = position.x;
        this.position.y = position.y;
    }
}
