package com.pong;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.pong.gameobjects.GameObject;
import com.pong.gameobjects.ball.Ball;
import com.pong.gameobjects.paddles.AIPaddle;
import com.pong.gameobjects.paddles.Paddle;
import com.pong.gameobjects.paddles.PlayerPaddle;

import java.util.ArrayList;

public class Pong extends ApplicationAdapter
{
	ArrayList<GameObject> gameObject;
	Paddle player, ai;
	Ball ball;
	
	@Override
	public void create()
	{
		gameObject = new ArrayList<GameObject>();
		player = new PlayerPaddle();
		ai = new AIPaddle();
		ball = new Ball();

		gameObject.add(player);
		gameObject.add(ai);
		gameObject.add(ball);
	}

	@Override
	public void render()
	{
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		for(int i = 0; i < gameObject.size(); ++i)
		{
			gameObject.get(i).render();
		}
	}
}
