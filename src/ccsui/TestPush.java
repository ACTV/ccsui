package ccsui;
import java.util.Random;

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
	Cylinder plantStructure;

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
		addGameWorldObject(cichlidOne);
		
		cichlidTwo = new Rectangle(0.02f, 0.01f);
		addGameWorldObject(cichlidTwo);
		
		// going to make a cylinder the "plant structure"
		plantStructure = new Cylinder();
		addGameWorldObject(plantStructure);
		
		// HUD
		display.setTitle("Convict Cichlid Simulator");
		timeDisplay = new HUDString("Time Elapsed : " + time);
		addGameWorldObject(timeDisplay);
		tempDisplay = new HUDString("Temperature (C) : " + temperature);
		tempDisplay.setLocation(0, 0.05f);
		addGameWorldObject(tempDisplay);
	}
	
	public void update(float timeElapsed)
	{
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
		time += timeElapsed;
		
		timeDisplay.setText("Time Elapsed : " + time/1000);
		
		super.update(timeElapsed);
	}
}
