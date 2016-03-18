package com.pong.gameobjects.entities.ball;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.pong.Pong;
import com.pong.gameobjects.GameObject;
import com.pong.gameobjects.entities.Entity;
import com.pong.gameobjects.entities.paddles.PlayerPaddle;
import com.pong.interfaces.Moveable;

import java.awt.Rectangle;
import java.util.Random;

/**
 * Created by Carl on 12/03/2016.
 */
public class Ball extends Entity implements Moveable
{
    private Random random;
    private Vector2 direction;

    public Ball()
    {
        width = 10.0f;
        height = 10.0f;
        speed = 2;
        random = new Random();
        position = new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        direction = new Vector2(random.nextInt(2), 0);
        hitBox = new Rectangle((int)position.x, (int)position.y, (int)width, (int)height);

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
        shape.rect(position.x, position.y, width, height);
        shape.end();
    }

    public void move()
    {
        hitBox.setLocation((int)position.x, (int)position.y);
    }

    protected void handleCollisions()
    {
        for(Entity obj : Pong.entity)
        {
            if(obj instanceof PlayerPaddle)
            {
                if(hitBox.intersects(obj.getHitBox()))
                {
                    System.out.println("Collision detected!");
                }
            }
        }
    }
}
