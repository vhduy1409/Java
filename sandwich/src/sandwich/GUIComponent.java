import java.awt.Button;

public class GUIComponent
{	
	protected Button startButton, stopButton;
	
	public void button()
	{
		super("Button");
		
		setSize(200,100);
		
		setLayout(new FlowLayout());
		
		startButton = new startButton("Start");
		stopButton = new stopButton("Stop");
		
		add(startButton);
		add(stopButton);
		
		startButton.addActionListener(myButtonListener);
		stopButton.addActionListener(myButtonListener);
		
		setVisible(true);
	}
}
