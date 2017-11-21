import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class Block extends JLabel implements MouseListener{
	private int id;
	private boolean isChanged = false;
	public Block(int i) {
		super("______",JLabel.CENTER);
		this.id = i;
		addMouseListener(this);
		setEnabled(true);
		setOpaque(true);
		setFont(new Font(getFont().getName(), Font.BOLD, 23));
	    setBackground(Color.black);
	    setForeground(Color.WHITE);
	    
	}
	
	public void setWinColor(){
		setForeground(Color.CYAN);
	}
	


	public void setDefault() {
		setText("______");
		isChanged = false;
		setBackground(Color.black);
	    setForeground(Color.WHITE);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(WinLogic.gameOver==false){
			Debuger.Log("clicked on : "+id);
			
			if(isChanged==false ) {
				isChanged = true;
				setText(GameChar.GetChar());
				GameStatus.setPlayerturnText(GameChar.charState);
				WinLogic.checkWin();
			}
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		setBackground(Color.gray);
	}
	
	@Override
	public void mouseExited(MouseEvent arg0) {
		setBackground(Color.black);
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
