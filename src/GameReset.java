import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameReset extends JPanel{
	public static JLabel statusText;
	private XOGameWindow game;
	public GameReset(XOGameWindow g) {
		game = g;
		setBackground(Color.BLACK);
		statusText = new JLabel("Reset Game",JLabel.CENTER);
		statusText.setEnabled(true);
		statusText.setOpaque(true);
		statusText.setFont(new Font(getFont().getName(), Font.BOLD, 23));
		statusText.setForeground(Color.white);
		statusText.setBackground(Color.black);
		statusText.setSize(400, 100);
		statusText.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				statusText.setForeground(Color.cyan);
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				statusText.setForeground(Color.white);
				
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				game.resetGame();
				Debuger.Log("Game Resetting");
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				statusText.setForeground(Color.DARK_GRAY);
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		add(statusText);
	}
	
}
