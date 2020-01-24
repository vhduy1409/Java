package GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class gui extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("New App");
				
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		JButton ok = new JButton("OK");
		JButton cancel = new JButton("CANCEL");
		
		frame.add(ok);
		frame.add(cancel);
		ok.setBounds(100, 350, 100, 50);
		cancel.setBounds(300, 350, 100, 50);

	}

}
