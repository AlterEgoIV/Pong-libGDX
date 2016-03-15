package com.pong.gameobjects.paddles;

import com.pong.gameobjects.GameObject;
import com.pong.interfaces.Moveable;

/**
 * Created by Carl on 12/03/2016.
 */
abstract public class Paddle extends GameObject implements Moveable
{
    protected final int speed;

    public Paddle()
    {
        width = 10.0f;
        height = 50.0f;
        speed = 10;
    }
}
