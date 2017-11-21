import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameStatus extends JPanel {
	public static JLabel statusText;
	public GameStatus() {
		setBackground(Color.BLACK);
		statusText = new JLabel("Turn : Player X",JLabel.CENTER);
		statusText.setEnabled(true);
		statusText.setOpaque(true);
		statusText.setFont(new Font(getFont().getName(), Font.BOLD, 23));
		statusText.setForeground(Color.white);
		statusText.setBackground(Color.BLACK);
		statusText.setSize(400, 100);
		add(statusText);
	}
	
	public static void setPlayerturnText(String tx){
		statusText.setText("Turn : Player "+tx);
	}
	
	public static void setWinGameStatus(String tx){
		statusText.setText("Player "+tx+" Wins !");
		statusText.setForeground(Color.cyan);
	}
	
	public void resetGame(){
		statusText.setText("Turn : Player X");
		statusText.setForeground(Color.white);
	}
}
