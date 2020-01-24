package TicTacToeGUI;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Window extends JFrame
{
	private Container pane;
	private String currentPlayer;
	private JButton [][] board;
	private boolean hasWinner;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem quit;
	private JMenuItem newGame;
	
	public Window()
	{
		super();
		pane = this.getContentPane();
		pane.setLayout(new GridLayout(3,3));
		setTitle("Tic Tac Toe");
		setSize(500,500);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		currentPlayer = "X";
		board = new JButton[3][3];
		hasWinner = false;
		inializeBoard();
		intializeMenuBar();
		
	}
	
	private void intializeMenuBar()
	{
		menuBar = new JMenuBar();
		menu = new JMenu("File");
		
		newGame = new JMenuItem("New Game");
		newGame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				resetBoard();
			}
		});
		
		quit = new JMenuItem("Quit");
		quit.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			System.exit(0);
		}
		});
		
		menu.add(newGame);
		menu.add(quit);
		menuBar.add(menu);
		setJMenuBar(menuBar);
	}
	
	private void resetBoard()
	{
		currentPlayer = "X";
		hasWinner = false;
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0;j<3;j++)
			{
				board[i][j].setText("");
			}
		}
	}
	
	private void inializeBoard()
	{
		for(int i = 0; i < 3;i++)
		{
			for(int j =0;j<3;j++)
			{
				JButton btn = new JButton();
				board[i][j] = btn;
				btn.addActionListener(new ActionListener()
						{
							
								
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								if(((JButton)e.getSource()).getText().equals("") &&
								hasWinner == false)
								{
									btn.setText(currentPlayer);
									hasWinner();
									togglePlayer();
								}
								
							}
						});
				pane.add(btn);
			}
		}
	}
	private void togglePlayer()
	{
		if(currentPlayer.equals("X"))
			currentPlayer = "O";
		else
			currentPlayer = "X";
	}
	
	private void hasWinner()
	{
		if(board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer))
		{
			JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
			hasWinner = true;
		}
		if(board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer))
		{
			JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
			hasWinner = true;
		}
		if(board[0][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer))
		{
			JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
			hasWinner = true;
		}
		if(board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer))
		{
			JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
			hasWinner = true;
		}
		if(board[2][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer))
		{
			JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
			hasWinner = true;
		}
		if(board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer))
		{
			JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
			hasWinner = true;
		}
		if(board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer))
		{
			JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
			hasWinner = true;
		}
		if(board[0][2].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer))
		{
			JOptionPane.showMessageDialog(null, "Player" + currentPlayer + "has won");
			hasWinner = true;
		}
		
		
		
	}
	
}
