
public class WinLogic {
	public static Block[] blk = new Block[9];
	public static boolean gameOver = false;
	public WinLogic(Block[] bl){
		blk = bl;
	}
	// 0 1 2
	// 3 4 5
	// 6 7 8
	public static void checkWin(){
		
		if(blk[0].getText() ==  blk[1].getText() && blk[0].getText() == blk[2].getText() && ( blk[0].getText() == "X" || blk[0].getText() == "O")){
			Debuger.Log(blk[0].getText()+" : Wins!");
			blk[0].setWinColor();
			blk[1].setWinColor();
			blk[2].setWinColor();
			gameOver = true;
		}
		
		else if(blk[3].getText() ==  blk[4].getText() && blk[3].getText() == blk[5].getText() && ( blk[3].getText() == "X" || blk[3].getText() == "O")){
			Debuger.Log(blk[3].getText()+" : Wins!");
			blk[3].setWinColor();
			blk[4].setWinColor();
			blk[5].setWinColor();
			gameOver = true;
		}
		
		else if(blk[6].getText() ==  blk[7].getText() && blk[6].getText() == blk[8].getText() && ( blk[6].getText() == "X" || blk[6].getText() == "O")){
			Debuger.Log(blk[6].getText()+" : Wins!");
			blk[6].setWinColor();
			blk[7].setWinColor();
			blk[8].setWinColor();
			gameOver = true;
		}
		
		else if(blk[0].getText() ==  blk[3].getText() && blk[0].getText() == blk[6].getText() && ( blk[0].getText() == "X" || blk[0].getText() == "O")){
			Debuger.Log(blk[0].getText()+" : Wins!");
			blk[0].setWinColor();
			blk[3].setWinColor();
			blk[6].setWinColor();
			gameOver = true;
		}
		
		else if(blk[1].getText() ==  blk[4].getText() && blk[1].getText() == blk[7].getText() && ( blk[1].getText() == "X" || blk[1].getText() == "O")){
			Debuger.Log(blk[1].getText()+" : Wins!");
			blk[1].setWinColor();
			blk[4].setWinColor();
			blk[7].setWinColor();
			gameOver = true;
		}
		
		else if(blk[2].getText() ==  blk[5].getText() && blk[2].getText() == blk[8].getText() && ( blk[2].getText() == "X" || blk[2].getText() == "O")){
			Debuger.Log(blk[1].getText()+" : Wins!");
			blk[2].setWinColor();
			blk[5].setWinColor();
			blk[8].setWinColor();
			gameOver = true;
		}
		
		else if(blk[0].getText() ==  blk[4].getText() && blk[0].getText() == blk[8].getText() && ( blk[0].getText() == "X" || blk[0].getText() == "O")){
			Debuger.Log(blk[1].getText()+" : Wins!");
			blk[0].setWinColor();
			blk[4].setWinColor();
			blk[8].setWinColor();
			gameOver = true;
		}
		
		else if(blk[2].getText() ==  blk[4].getText() && blk[2].getText() == blk[6].getText() && ( blk[2].getText() == "X" || blk[2].getText() == "O")){
			Debuger.Log(blk[1].getText()+" : Wins!");
			blk[2].setWinColor();
			blk[4].setWinColor();
			blk[6].setWinColor();
			gameOver = true;
		}
		
		if(gameOver == true){
			if(GameChar.charState == "X"){
				GameStatus.setWinGameStatus("O");
			}else{

				GameStatus.setWinGameStatus("X");
			}
		}
	}
	
	public static void resetGame(){
		gameOver = false;
	}
}
