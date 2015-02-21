package ccsui;
import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;

import sage.app.BaseGame;
import sage.display.IDisplaySystem;
import sage.scene.*;
import sage.scene.shape.*;

// here is the basic run simulation 
public class TestPush extends BaseGame {
	// declare variables
	IDisplaySystem display;
	private float time = 0;
	private float temperature = 0;
	HUDString timeDisplay;
	HUDString tempDisplay;
	Rectangle cichlidOne;
	Rectangle cichlidTwo;
	Rectangle button; 
	Rectangle plantStructure;
	
	public void initGame()
	{
		initSimulationObjects();
		
		// will not mess around with cameras now
		
	}
	public void initSimulationObjects()
	{
		display = getDisplaySystem();
		
		// rectangles are ... fish
		cichlidOne = new Rectangle(0.02f, 0.01f);
		cichlidOne.translate(.3f, .3f, .3f);
		addGameWorldObject(cichlidOne);
		
		cichlidTwo = new Rectangle(0.02f, 0.01f);
		cichlidTwo.translate(-.3f, -.3f, -.3f);
		addGameWorldObject(cichlidTwo);
		
		
		// going to make a cylinder the "plant structure"
		plantStructure = new Rectangle(.1f, .1f);
		plantStructure.setColor(Color.green);
		plantStructure.translate(.1f, .1f, .1f);
		addGameWorldObject(plantStructure);
		
		// HUD
		display.setTitle("Convict Cichlid Simulator");
		timeDisplay = new HUDString("Time Elapsed : " + time);
		addGameWorldObject(timeDisplay);
		tempDisplay = new HUDString("Temperature (C) : " + temperature);
		tempDisplay.setLocation(0, 0.05f);
		addGameWorldObject(tempDisplay);
		
		// i can create text data for the fish, such as aggression level etc.
	}
	
	public void update(float timeElapsed)
	{
		/* 
		for (SceneNode s : getGameWorld())
		{
			Random rng = new Random();
			float dx = (rng.nextFloat()*2-1)*(float)0.05;
			float dy = (rng.nextFloat()*2-1)*(float)0.05;
			
			if (s.equals(cichlidOne))
			{
				cichlidOne.translate(dx, dy, 0);
			}
			if (s.equals(cichlidTwo))
			{
				cichlidTwo.translate(dx, dy, 0);
			}
			
		}
		*/
		time += timeElapsed;
		
		timeDisplay.setText("Time Elapsed : " + time/1000);
		
		super.update(timeElapsed);
	}
}
