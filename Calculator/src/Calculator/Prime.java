package Calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Calculator");
		
		frame.setSize(600,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		
		
		JPanel panel1 = new JPanel(new GridLayout(4,3));
		
		for(int i =1;i <=9; i++)
		{
			panel1.add(new JButton("" + i));
		}
		
		
		panel1.add(new JButton("" + 0));
		panel1.add(new JButton("Start"));
		panel1.add(new JButton("End"));
		
		
		JPanel panel2 = new JPanel(new BorderLayout());
		
		panel2.add(new JTextField("Timer"), BorderLayout.NORTH);
		panel2.add(panel1, BorderLayout.CENTER);
		
		frame.add(new JButton("Put food here"), BorderLayout.WEST);
		frame.add(panel2, BorderLayout.CENTER);
		
		frame.addMouseListener(new MouseListener()
				{

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
				});
		
		
		frame.setVisible(true);

		
		
		

		
		
		
	}

}
