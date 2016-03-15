package com.pong.gameobjects.ball;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.pong.gameobjects.GameObject;
import com.pong.interfaces.Moveable;

import java.util.Random;

/**
 * Created by Carl on 12/03/2016.
 */
public class Ball extends GameObject implements Moveable
{
    private Random random;
    private Vector2 direction;
    private float radius;

    public Ball()
    {
        random = new Random();
        position = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        direction = new Vector2(random.nextInt(2), 0);
        radius = 4.0f;

        if(direction.x == 0) { direction.x = -1; }
    }

    public void update()
    {
        move();
        handleCollisions();
    }

    public void render()
    {
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.setColor(Color.MAROON);
        shape.circle(position.x, position.y, radius * 2);
        shape.end();
    }

    public void move()
    {

    }

    protected void handleCollisions()
    {

    }
}
