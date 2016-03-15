package com.pong.gameobjects.paddles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Carl on 12/03/2016.
 */
public class AIPaddle extends Paddle
{
    public AIPaddle()
    {
        position = new Vector2(Gdx.graphics.getWidth() - (Gdx.graphics.getWidth() / 20), Gdx.graphics.getHeight() / 2);
    }

    public void update()
    {

    }

    public void render()
    {
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.setColor(Color.CORAL);
        shape.rect(position.x, position.y, width, height);
        shape.end();
    }

    public void move()
    {

    }
}
