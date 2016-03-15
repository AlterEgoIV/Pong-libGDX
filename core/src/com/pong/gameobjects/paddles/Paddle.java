package com.pong.gameobjects.paddles;

import com.pong.gameobjects.GameObject;

/**
 * Created by Carl on 12/03/2016.
 */
abstract public class Paddle extends GameObject
{
    protected final int speed;

    public Paddle()
    {
        width = 10.0f;
        height = 50.0f;
        speed = 10;
    }
}
