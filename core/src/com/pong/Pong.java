package com.pong;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.pong.gameobjects.GameObject;
import com.pong.gameobjects.ball.Ball;
import com.pong.gameobjects.paddles.AIPaddle;
import com.pong.gameobjects.paddles.PlayerPaddle;
import com.pong.states.GameState;

import java.util.ArrayList;

public class Pong extends ApplicationAdapter
{
	public GameState gameState;
	private ArrayList<GameObject> gameObject;
	
	@Override
	public void create()
	{
		gameState = GameState.PLAY;
		gameObject = new ArrayList<GameObject>();

		gameObject.add(new PlayerPaddle());
		gameObject.add(new AIPaddle());
		gameObject.add(new Ball());
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
				for(int i = 0; i < gameObject.size(); ++i)
				{
					gameObject.get(i).render();
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
