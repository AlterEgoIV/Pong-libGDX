package com.pong.gameobjects.entities.paddles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;

import java.awt.Rectangle;

/**
 * Created by Carl on 12/03/2016.
 */
public class AIPaddle extends Paddle
{
    public AIPaddle()
    {
        position = new Vector2((Gdx.graphics.getWidth() - (Gdx.graphics.getWidth() / 20)) + halfWidth,
                              (Gdx.graphics.getHeight() / 2) - halfHeight);
        hitBox = new Rectangle((int)position.x, (int)position.y, (int)width, (int)height);
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
