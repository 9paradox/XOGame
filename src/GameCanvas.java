import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameCanvas extends JPanel{

	Block[] blk;
	WinLogic winlogic;
	
	public GameCanvas() {
		
		blk = new Block[9];
		
		for(int i = 0; i<9 ; i++){
			blk[i] = new Block(i);
			add(blk[i]);
		}
		
		winlogic = new WinLogic(blk);
		setLayout(new GridLayout(3,3));
	}
	
	public void clearGame(){
		for(int i = 0; i<9 ; i++){
			blk[i].setDefault();
		}
	}
}
