package com.pong.gameobjects.ball;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.pong.gameobjects.GameObject;

/**
 * Created by Carl on 12/03/2016.
 */
public class Ball extends GameObject
{
    private float radius;

    public Ball()
    {
        position = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        radius = 5.0f;
    }

    public void update()
    {

    }

    public void render()
    {
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.setColor(Color.MAROON);
        shape.circle(position.x, position.y, radius * 2);
        shape.end();
    }
}
