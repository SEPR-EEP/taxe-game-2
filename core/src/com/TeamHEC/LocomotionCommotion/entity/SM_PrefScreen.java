package com.TeamHEC.LocomotionCommotion.entity;

import com.TeamHEC.LocomotionCommotion.TextureManager;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;
import com.sun.org.apache.xpath.internal.axes.SelfIteratorNoPredicate;

public class SM_PrefScreen extends Entity{

	public SM_PrefScreen(Vector2 pos, Vector2 direction) {
		super(TextureManager.prefscreen, pos, direction);
	}

	@Override
	public void update() {
		pos.add(direction); 

		if (Gdx.input.isKeyPressed(Keys.A))
			setDirection(-300,0);  //Left need to use this when button pressed.
		else if (Gdx.input.isKeyPressed(Keys.D))
			setDirection(300,0); //right need to use this when button pressed.
		else if (Gdx.input.isKeyPressed(Keys.W))
			setDirection(0,300); //UP need to use this when button pressed.
		else if (Gdx.input.isKeyPressed(Keys.S))
			setDirection(0,-300); //DOWN need to use this when button pressed.
		else
			setDirection(0,0);
//		System.out.println("postition:"+pos.x+ "," + pos.y);
	}
	



}