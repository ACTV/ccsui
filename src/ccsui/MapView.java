package ccsui;

import javax.swing.JPanel;

public class MapView extends JPanel implements IObserver {
	
	private TestPush tP;
	
	public MapView(TestPush t)
	{
		tP = t;
	}
	
	public void update(IObservable o, Object obj)
	{
		obj = (TestPush) o;
		System.out.println("doin it doin doin it");
	}
}
