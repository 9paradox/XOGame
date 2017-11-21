import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class XOGameWindow extends JFrame{
	
	GameCanvas game;
	GameStatus status;
	GameReset reset;
	BorderLayout layout;
	
	public XOGameWindow() {
		game = new GameCanvas();
		status = new GameStatus();
		layout = new BorderLayout();
		reset = new GameReset(this);
		setLayout(layout);
		
		add(status, BorderLayout.PAGE_START);
		add(game, BorderLayout.CENTER);
		add(reset,BorderLayout.PAGE_END);
		
		setTitle("XO");
		pack();
		setSize(400, 450);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void resetGame(){
		game.clearGame();
		GameChar.resetChar();
		WinLogic.resetGame();
		status.resetGame();
	}
}
