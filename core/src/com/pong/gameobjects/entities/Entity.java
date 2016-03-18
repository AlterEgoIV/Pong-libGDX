package com.pong.gameobjects.entities;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.pong.gameobjects.GameObject;

import java.awt.Rectangle;

/**
 * Created by Carl on 17/03/2016.
 */
public abstract class Entity extends GameObject
{
    protected Vector2 prevPosition;
    protected Rectangle hitBox;
    protected int speed;

    public Entity()
    {
        prevPosition = new Vector2(0, 0);
    }

    protected abstract void handleCollisions();

    public Vector2 getPrevPosition() { return prevPosition; }
    public Rectangle getHitBox() { return hitBox; }
    public int getSpeed() { return speed; }
}
