package view;

import javax.swing.JFrame;

import contoller.StupidController;

public class StupidFrame extends JFrame
{
	private StupidPanel basePanel;
	
	public StupidFrame(StupidController baseController)
	{
		basePanel = new StupidPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Stupid Project");
	}
}
