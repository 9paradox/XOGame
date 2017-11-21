
public class GameChar {
public static String charState = "X";
	
	public static String GetChar() {
		if(charState == "X") {
			charState = "O";
			return "X";
		}else {
			charState = "X";
			return "O";
		}
	}
	
	public static void resetChar(){
		charState = "X";
	}
}
