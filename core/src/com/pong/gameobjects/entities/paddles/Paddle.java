package com.pong.gameobjects.entities.paddles;

import com.badlogic.gdx.Gdx;
import com.pong.gameobjects.entities.Entity;
import com.pong.interfaces.Moveable;
import com.pong.states.PaddleState;

/**
 * Created by Carl on 12/03/2016.
 */
abstract public class Paddle extends Entity implements Moveable
{
    public PaddleState paddleState;

    public Paddle()
    {
        width = 10.0f;
        halfWidth = width / 2.0f;
        height = 50.0f;
        halfHeight = height / 2.0f;
        speed = 10;
    }

    protected void handleCollisions()
    {
        if(position.y + halfHeight > Gdx.graphics.getHeight())
        {
            position.y -= speed;
        }

        if(position.y < 0)
        {
            position.y += speed;
        }
    }
}
