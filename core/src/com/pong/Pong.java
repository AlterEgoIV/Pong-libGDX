package com.pong;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.pong.gameobjects.GameObject;
import com.pong.gameobjects.entities.Entity;
import com.pong.gameobjects.entities.ball.Ball;
import com.pong.gameobjects.entities.paddles.AIPaddle;
import com.pong.gameobjects.entities.paddles.PlayerPaddle;
import com.pong.states.GameState;

import java.util.ArrayList;

public class Pong extends ApplicationAdapter
{
	public GameState gameState;
	public static ArrayList<Entity> entity;
	
	@Override
	public void create()
	{
		gameState = GameState.PLAY;
		entity = new ArrayList<Entity>();

		entity.add(new PlayerPaddle());
		entity.add(new AIPaddle());
		entity.add(new Ball());
	}

	@Override
	public void render()
	{
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		switch(gameState)
		{
			case TITLE:
			{
				break;
			}

			case MAINMENU:
			{
				break;
			}

			case PLAY:
			{
				for(int i = 0; i < entity.size(); ++i)
				{
					entity.get(i).update();
					entity.get(i).render();
				}

				break;
			}

			case PAUSE:
			{
				break;
			}

			case GAMEOVER:
			{
				break;
			}

			default:
			{
				System.out.println("Game in invalid state.");
			}
		}
	}
}
