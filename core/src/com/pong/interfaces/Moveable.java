package com.pong.interfaces;

/**
 * Created by Carl on 15/03/2016.
 */

/*
    I feel that a Moveable interface is currently necessary to avoid giving every GameObject
    the ability to move(). The alternative is to make move() an abstract method in GameObject,
    but this would force every GameObject to have the ability to move(), which may or may not be
    appropriate down the line. The main advantage of doing so however, is that move() could be made
    protected to stop external entities from calling it. This is where allowing protected methods
    in interfaces would be useful.
 */
public interface Moveable
{
    void move();
}
